class A{
}

class B extends A{
}

public class ProvaCast {
	public static void main(String[] args) {
		long l = 100000000000l;
		int x = (int)l;
		System.out.println(x);
		//
		// BUG 
		//
		int v1 = 2000000000;
		int v2 = 2000000000;
		
		int mi = (v1 + v2) /2;
		int mi2 = (v1/2 + v2 /2);
		int mi3 = v1 + (v2-v1)/2; // corretto
		System.out.println(mi);
		
		// con le classi
		B b1 = new B();
		A a = b1;
		B b = (B)a;
		//B b2 = a;
		A a2 = new A();
		B b3 = (B) a2;
	}

}
