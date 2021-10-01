 
public class Prova {
	
	
	public static void main(String[] args) {
		int x = 10;
		assert x < 9 : "hai sbagliato x";
		sqrt2(0);
	}
	
	//@ requires x >= 0;
	private static void sqrt2(int x){
		return;
	}

}
