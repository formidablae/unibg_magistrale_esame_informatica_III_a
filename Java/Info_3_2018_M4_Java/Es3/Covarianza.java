package Es3;


class A {
	Object stampa() {
		return new Object();
	}
}

class B extends A {

	Integer stampa() {
		return 3;
	}
}


public class Covarianza {


	public static void main(String[] args) {
		B b = new B();
		A a = b;
		System.out.println(a.stampa());
	}
	
	

	
}
