
public class A {
	int x;
}


final class B extends A{ void m(){} }

class C extends B{}

class B2 extends A{  final void m(){}}
// metodo final non può essere ridefinito
// non è soggetto a late binding
class C2 extends B2{
	void m(){}
}

class Prova{
	public static void main(String[] args) {
		A a  = new A();
		System.out.println(a.toString());
	}
}