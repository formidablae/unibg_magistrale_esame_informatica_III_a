class A{int x;}

public class PassingParameters {
	public static void foo(int x){
		x = 0;
	}
	public static void foo(A a){
		a.x = 0;
	}
	public static void main(String[] args) {
		// for build in variables
		int y = 9;
		foo(y);
		System.out.println(y);
		// for references
		A p = new A();
		p.x = 9;
		foo(p);
		System.out.println(p.x);
		
	}
	
}
