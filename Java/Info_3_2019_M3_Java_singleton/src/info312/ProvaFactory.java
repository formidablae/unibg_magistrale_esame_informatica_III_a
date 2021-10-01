package info312;

// bambino sempre sì o sempre no
class Bambino {
	
	boolean sempreSi;

	private Bambino(boolean ss){
		sempreSi = ss;
	}
	
	boolean risposta(){
		return sempreSi;
	}

	static Bambino bimboSi = new Bambino(true);
	static Bambino bimboNo = new Bambino(false);
}

public class ProvaFactory {
	public static void main(String[] args) {
		Bambino b1 = new Bambino(true);
	}
}