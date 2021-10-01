package bindingdinmacio;

class A{
	void m(int x){}
}

class B extends A{
	@Override
	void m(int x){}	
}

public class Overriding {

	public static void main(String[] args) {
		A a;
		a = new B();
		a.m(3);
		a.m(4.4);
	}
}
