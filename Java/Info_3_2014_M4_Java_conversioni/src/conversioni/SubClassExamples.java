package conversioni;

class A{
	public void f(){}
}

class B extends A{
	// NO POSSO
	//private void f(){}
}

// NO in JAVA non si pu� ered. multipla
//class C extends A, List<A>{
//	
//}


public class SubClassExamples {

	public static void main(String[] args) {
		B b = new B();
		b.f();
		
		// posso perch� B � sottoclasse
		// quindi anche sottotipo
		A a = new B();
		
		// cast al contrario
		B b2 = (B)a;
		
		
	}
	
}
