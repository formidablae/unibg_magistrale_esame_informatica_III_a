package usoeccezioni;

// non controllate
class E1 extends RuntimeException{
	public E1(String s) {
		super(s);
	}
}

class EC extends Exception{
	public EC(String s) {
		super(s);
	}
}

public class UsoEcc {

	public static void main(String[] args) {
		A a = new A();
		//a.me1();
		
		try {
			a.mec();
		} catch (EC e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
