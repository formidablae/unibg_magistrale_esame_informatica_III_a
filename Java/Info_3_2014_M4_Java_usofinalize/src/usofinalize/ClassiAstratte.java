package usofinalize;

abstract class  A{
	
	// possono aver emetodi astratti
	abstract int f();
	//  e mtodi non astratti
	void m(){System.out.println("M");}
	
}
// B sia sottoripo che ottoclasse di A
class B extends A{
	@Override
	int f() {
		return 0;
	}
}


public class ClassiAstratte {

	public static void main(String[] args) {
		// non posso perchè A è astratta
		// A a = new A();
		A a = new B();
		a.f();
	}
	
}
