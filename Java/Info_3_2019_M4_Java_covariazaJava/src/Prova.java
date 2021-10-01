class A{
	A m(B y){return new A();}
}
class B extends A{
	@Override
	B m(B y){ return new B();}
	@Override	
	A m(A h){ return null;}
}


public class Prova {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
