class A2 {

	void assegna (int x){}

	void z(double x, int d){};
}

class B extends A2 {
	void assegna (long y){}
	void assegna (double y){}

	void z(int x, double d){};
}

class C extends B {
	void assegna (long y){}
	void assegna (double y){}

}

public class Prova2 {
	public static void main(String[] args) {
		B b = new C();
		
		b.assegna(5.0);

	}
}