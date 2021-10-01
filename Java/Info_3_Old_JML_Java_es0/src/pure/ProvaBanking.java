package pure;

public class ProvaBanking {
	
	public static void main(String[] args) throws BankingException {
		BankingExample be = new BankingExample();
		be.credit(-20);
		System.out.println(be.getBalance());
	}

}
