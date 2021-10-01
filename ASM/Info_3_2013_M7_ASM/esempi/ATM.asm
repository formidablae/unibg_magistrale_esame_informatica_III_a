// ATM
// versione di maggio 2007 Paolo Arcaini e AG
//

asm ATM

import STDL/StandardLibrary

signature:

	abstract domain NumCard
	enum domain State = { AWAITCARD | AWAITPIN | CHOOSE | OUTOFSERVICE | CHOOSEAMOUNT | STANDARDAMOUNTSELECTION | OTHERAMOUNTSELECTION}
	domain MoneySize subsetof Integer //tagli selezionabili
	enum domain Service = {BALANCE | WITHDRAWAL | EXIT}
	enum domain MoneySizeSelection = {STANDARD | OTHER}

	dynamic controlled currCard: NumCard//numero della carta presente nel bancomat
	dynamic controlled atmState: State
	dynamic controlled outMess: String//messaggio stampato sul video
	static pin: NumCard -> Integer
	dynamic controlled accessible: NumCard -> Boolean
	dynamic controlled moneyLeft: Integer
	dynamic controlled balance: NumCard -> Integer

	dynamic monitored insertedCard: NumCard //numero della carta inserita
	dynamic monitored insertedPin: Integer //numero di pin inserito
	dynamic monitored selectedService: Service //l'utente puo' scegliere di visualizzare il conto o effettuare un prelievo
	dynamic monitored insertMoneySize: Integer
	dynamic monitored standardOrOther: MoneySizeSelection //

	derived allowed: Prod(NumCard, Integer) -> Boolean

	static card1: NumCard
	static card2: NumCard
	static card3: NumCard


	static minMoney: Integer
	static maxPrelievo: Integer

definitions:
	domain MoneySize = {10, 20, 40, 50, 100, 150, 200} //tagli prestabiliti per il prelievo
	function minMoney = 200 //quantita' minima di soldi necessaria per il funzionamento del bancomat
	function maxPrelievo = 1000

	function pin($c in NumCard) =
		switch($c)
			case card1 : 1
			case card2 : 2
			case card3 : 3
		endswitch



	//il prelievo e' possibile se la cifra richiesta e' inferiore al saldo
	function allowed($c in NumCard, $m in Integer) =
		balance($c) >= $m


	macro rule r_subtractFrom ($c in NumCard, $m in Integer) =
		balance($c) := balance($c) - $m


	//controlla che ci sia una quantita' minima di soldi
	macro rule r_goOutOfService =
		if (moneyLeft < minMoney) then
			par
				atmState := OUTOFSERVICE
				outMess := "Out of Service"
			endpar
		endif


	macro rule r_insertcard =
		if(atmState=AWAITCARD) then
				par
					currCard := insertedCard
					atmState := AWAITPIN
					outMess := "Enter pin"
					print("inserisci pin")
				endpar
		endif


	macro rule r_enterPin =
		if(atmState=AWAITPIN) then
			//il pin deve essere corretto e l'account non deve essere bloccato su precedenti operazioni pendenti
			if(insertedPin=pin(currCard) and accessible(currCard)) then
				par
					outMess := "Choose service"
					atmState := CHOOSE
				endpar
			else
				par
					atmState := AWAITCARD//viene restituita la carta e il bancomat attende una nuova carta
					if(insertedPin!=pin(currCard)) then
						outMess := "Wrong pin"
					endif
					if(not(accessible((currCard))) and insertedPin=pin(currCard)) then
						outMess := "Account non accessible"
					endif
				endpar
			endif
		endif


	macro rule r_chooseService =
		if(atmState=CHOOSE) then
			par
				if(selectedService=BALANCE) then
					outMess := balance(currCard) //stampa a video del saldo
				endif
				if(selectedService=WITHDRAWAL) then
					par
						atmState := CHOOSEAMOUNT //l'utente deve selezionare una cifra standard o inserire la cifra
						outMess := "Choose Standard or Other"
					endpar
				endif
				if(selectedService=EXIT) then
					par
						atmState := AWAITCARD //l'utente ha scelto di uscire
						outMess := "Goodbye"
					endpar
				endif
			endpar
		endif


	rule r_chooseAmount =
		if(atmState=CHOOSEAMOUNT) then
			par
				if(standardOrOther=STANDARD) then
					par
						atmState := STANDARDAMOUNTSELECTION
						outMess := "Select a money size"
					endpar
				endif
				if(standardOrOther=OTHER) then
					par
						atmState := OTHERAMOUNTSELECTION
						outMess := "Enter money size"
					endpar
				endif
			endpar
		endif


	rule r_grantMoney($m in Integer) =
		par
			r_subtractFrom[currCard, $m]//sottrae dal conto la cifra richiesta
			moneyLeft := moneyLeft - insertMoneySize //i soldi nel bancomat diminuiscono
			seq
				accessible(currCard) := false //l'account non e' accessibile fino a quando non viene sbloccato dal sistema centrale
				accessible(currCard) := true //il sistema sblocca l'account (dovrebbe essere un altro agente)
			endseq
			atmState := AWAITCARD //viene espulsa la carta e il bancomat aspetta un'altra carta
			outMess := "Goodbye"
		endpar

	macro rule r_processMoneyRequest ($m in Integer) =
		if(allowed(currCard, $m)) then
			r_grantMoney[$m]
		else
			outMess := "Not enough money in your count"
		endif

	macro rule r_prelievo =
		par
			if(atmState=STANDARDAMOUNTSELECTION) then
				if(exist $m in MoneySize with $m=insertMoneySize) then
					if(insertMoneySize<=moneyLeft) then
						r_processMoneyRequest [insertMoneySize]
					else
						outMess := "Il bancomat non ha abbastanza soldi"
					endif
				endif
			endif
			if(atmState=OTHERAMOUNTSELECTION) then
				if(mod(insertMoneySize, 10)=0) then
					if(insertMoneySize<=moneyLeft) then
						r_processMoneyRequest [insertMoneySize]
					else
						outMess := "Il bancomat non ha abbastanza soldi"
					endif
				else
					outMess := "Tagli non compatibili"
				endif
			endif
		endpar


	main rule r_Main =
		seq
			r_goOutOfService[]
			par
				r_insertcard[]
				r_enterPin[]
				r_chooseService[]
				r_chooseAmount[]
				r_prelievo[]
			endpar
		endseq


// define the initial states
default init s0:
	function atmState = AWAITCARD //all'inizio il bancomat e' in attesa di una carta
	function moneyLeft = 1000 //soldi disponibili all'inizio nel bancomat
	function balance($c in NumCard) = switch($c)
										case card1 : 3000
										case card2 : 1652
										case card3 : 548
									endswitch
	function accessible($c in NumCard) = true
