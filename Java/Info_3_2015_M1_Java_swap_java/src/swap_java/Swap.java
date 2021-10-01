package swap_java;

class A {
	int x;
	static void swap(A x, A y){
		A temp = x;
		x = y;
		y = temp;
	}
	
	static int f(int x){
		int z = x + 10;
		//int h = f(z) +100;
		return f(z);
	}
	
}

public class Swap {
	public static void main(String[] args) {
		A.f(1000);
		A a = new A();
		a.x = 10;
		A b = new A();
		b.x = 20;
		System.out.println(a.x + " " + b.x);
		A.swap(a, b);
		System.out.println(a.x + " " + b.x);
		
	}

}
