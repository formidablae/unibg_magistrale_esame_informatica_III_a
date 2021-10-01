public class A {

	A m(int x){
		return new A();
	}

}

class B extends A {

	@Override
	// 1. segnatura tale quale : OK
	//A m(int x){ return new A();}
	// 2. NON POSSO RIDURRE
	//private A m(int x){ return new A();}
	// 3. AUMENTARE visibikità OK
	public A m(int x){ return new A();}
	// 4. OK covarianza
	//B m(int x){ return new B();}
	// 5. NO controvarianza o cambio qualsiasi
	//Object m(int x){ return new B();}
}