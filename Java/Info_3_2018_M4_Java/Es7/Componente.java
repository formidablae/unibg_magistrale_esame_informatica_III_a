import java.util.ArrayList;

public abstract class Componente implements Visitable {

	/*
	 * Metodo "ereditato" dall'interfaccia Visitable, che permette al visitor di
	 * accedere alle informazioni di questo oggetto
	 */
	public abstract <T> T accept(Visitor<T> v);

	/*
	 * Metodo statico per calcolare la somma dei costi di una lista di componenti
	 * Per fare in modo che accetti sia Componenti che Atomici la definisco con i
	 * WildCard, imponendo che la classe passata deve essere una sottoclasse di
	 * Componente
	 */
	static int sommaCosto(ArrayList<? extends Componente> lista) {
		int somma = 0;
		// Definisco il visitor che potrà calcolare i prezzi
		PriceCalculator PC = new PriceCalculator();
		for (int i = 0; i < lista.size(); i++) {
			somma += lista.get(i).accept(PC);
		}
		return somma;
	}

	public static void main(String[] args) {
		// Creo dei componenti
		ComponenteComposto C = new ComponenteComposto();
		ComponenteComposto C1 = new ComponenteComposto();
		ComponenteComposto C2 = new ComponenteComposto();
		ComponenteComposto C3 = new ComponenteComposto();
		// Aggiungo a questi componenti dei vari componenti atomici
		C.ListaC.add(new Atomico());
		C.ListaC.add(new Atomico());
		C.ListaC.add(new Atomico());
		C.ListaC.add(new Atomico());
		C1.ListaC.add(new Atomico());
		C1.ListaC.add(new Atomico());
		C3.ListaC.add(C);
		// Per prova calcolo il prezzo ed il nome del componente C e C3
		PriceCalculator PC = new PriceCalculator();
		NameCalculator NC = new NameCalculator();
		System.out.println(C.accept(PC));
		System.out.println(C.accept(NC));
		System.out.println(C3.accept(PC));
		System.out.println(C3.accept(NC));
		// Creo una lista di componenti, con i 4 che ho creato prima + un componente
		// atomico
		ArrayList<Componente> LC = new ArrayList<Componente>();
		LC.add(C);
		LC.add(C1);
		LC.add(C2);
		LC.add(C3);
		LC.add(new Atomico());
		// Calcolo il prezzo totale
		System.out.println(Componente.sommaCosto(LC));
	}
}

/*
 * Classe ATOMICO - Sottoclasse di Componente, anch'essa visitable
 */
class Atomico extends Componente implements Visitable {
	// Forzo il prezzo a 10 se il componente è atomico
	int prezzo = 10;
	// Forzo il nome a C se il componente è atomico
	String nome = "C";

	/*
	 * Metodo "ereditato" dall'interfaccia Visitable, che permette al visitor di
	 * accedere alle informazioni di questo oggetto
	 */
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}
}

/*
 * Classe COMPONENTE
 * 
 * Contiene un arrayList nella quale vengono messi tutti i componenti (o
 * atomici) di cui è composto il componente corrente
 */
class ComponenteComposto extends Componente {

	ArrayList<Componente> ListaC = new ArrayList<Componente>();

	/*
	 * Metodo "ereditato" dall'interfaccia Visitable, che permette al visitor di
	 * accedere alle informazioni di questo oggetto
	 */
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}

/*
 * VISITOR che permette di calcolare il Prezzo di un componente che lo accetta
 */
class PriceCalculator implements Visitor<Integer> {

	public Integer visit(ComponenteComposto c) {
		int sum = 0;
		// Scelgo quale metodo visit chiamare in funzione della classe a cui appartiene
		// runtime l'oggetto
		for (int i = 0; i < c.ListaC.size(); i++) {
			sum += c.ListaC.get(i).accept(this);
		}
		return sum;
	}

	public Integer visit(Atomico c) {
		return c.prezzo;
	}
}

/*
 * VISITOR che permette di calcolare il Nome di un componente che lo accetta
 */
class NameCalculator implements Visitor<String> {

	public String visit(ComponenteComposto c) {
		String res;
		res = "[";
		// Scelgo quale metodo visit chiamare in funzione della classe a cui appartiene
		// runtime l'oggetto
		for (int i = 0; i < c.ListaC.size(); i++) {
			res += c.ListaC.get(i).accept(this);
		}
		res += "]";
		return res;
	}

	public String visit(Atomico c) {
		return c.nome;
	}

}
