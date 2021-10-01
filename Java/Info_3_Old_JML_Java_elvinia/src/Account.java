public class Account {

	private String accountId;
	private int MAX_value;

	private int balance; // saldo

	private int opcost;

	public Account(String Id, int initialBalance, int costoConcordato, int vmax) {
		accountId = Id;
		balance = initialBalance;
		opcost = costoConcordato;
		MAX_value = vmax;
	}

	public boolean debit(int amount) {
		if (amount <= balance) {
			balance = balance - amount - opcost;
			return true;
		} else
			return false;
	}

	//@ requires amount > 0;
	public boolean credit(int amount) {
		int tmp = balance + amount - opcost;
		if (tmp <= MAX_value) {
			balance = tmp;
			return true;
		} else
			return false;
	}

	public int getBalance() {
		return balance;
	}

	public int getMAX() {
		return MAX_value;
	}

	public String getID() {
		return accountId;
	}

	public int getOpcost() {
		return opcost;
	}

	public static void main(String[] args) {
		System.out.println("inizio");
		Account utente = new Account("elvinia", 0, 5, 10000);
		System.out.println("utente = " + utente.getID());
		System.out.println("bilancio  = " + utente.getBalance());
		System.out.println("costo operazione = " + utente.getOpcost());
		System.out.println("massimo saldo = " + utente.getMAX());

		utente.credit(-500);
		System.out.println("eseguito versamento");
		System.out.println("utente = " + utente.getID());
		System.out.println("bilancio  = " + utente.getBalance());
		System.out.println("costo operazione = " + utente.getOpcost());
		System.out.println("massimo saldo = " + utente.getMAX());

		utente.debit(200);
		System.out.println("eseguito prelievo");
		System.out.println("utente = " + utente.getID());
		System.out.println("bilancio  = " + utente.getBalance());
		System.out.println("costo operazione = " + utente.getOpcost());
		System.out.println("massimo saldo = " + utente.getMAX());

		System.out.println("esito prelievo " + utente.debit(5000));

	}
}
