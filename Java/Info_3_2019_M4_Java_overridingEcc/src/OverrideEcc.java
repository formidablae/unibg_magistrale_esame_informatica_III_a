class E1 extends RuntimeException {}
class E2 extends E1{}

class A {
	protected A m(int x, int y) throws E1 {
		return null;
	}
}

class B extends A {
	@Override
	// SI protected A m(int x, int y) throws E1 { return null;}
	// NO private A m(int x, int y) throws E1 { return null;}
	// SI aumentare visibilità
	// public A m(int x, int y) throws E1 { return null;}
	// SI covarianza del tipo riotrnato
	//protected B m(int x, int y) throws E1 {return null;	}
	// NO CAMBIARE tipi dei paramteri
	//protected B m(int x) throws E1 {return null;	}
	// SI : nessuna eccezione
	//protected A m(int x, int y) { return null;}
	// SI protected A m(int x, int y) throws E2 { return null;}
	// NO 
	protected A m(int x, int y) throws Exception { return null;}
}

public class OverrideEcc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
