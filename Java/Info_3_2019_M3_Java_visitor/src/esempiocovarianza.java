// esempio di covarianza, da spostare

class A{
	private A foo(){return this;}
}

class B extends A{
	public B foo(){return this;}	
}

public class esempiocovarianza {

	public static void main(String[] args) {

		A i = new B();
		//A x = i.foo();
		
	}
	
}
