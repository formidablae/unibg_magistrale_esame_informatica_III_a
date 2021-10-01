package sedici;
	
class A{
	void m(double l){System.out.println("A");}
}
class B extends A{
	void m(int l){System.out.println("B");}
}
public class Test {
	public static void main(String[] args) {
		A a = new B();
		a.m(3);
	}

}
