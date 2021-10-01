package bindingdinmacio;

class A{
	static void m(int x){System.out.println("Mint");}
	static void m(double x){System.out.println("Mdouble");}

	static void f(int g, double d){};
	static void f(double d, int g){};	
	
}


public class Overloading {
	
	public static void main(String[] args) {

		A.f(3, 3);

		A.m(3);
		A.m(6.67);
		//
		double y = 2;
		A.m(y); // double
		
		short u = 8;
		A.m(u);
	}

}
