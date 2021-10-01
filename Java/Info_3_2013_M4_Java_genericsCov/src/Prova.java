
public class Prova<T> {

	// cose che non potete fare:
	T x = new T();
	T[] g = new T[10];
	
	void foo(T a){}
	
	T pttt(){ return null;}
	
	
	public static void main(String[] args) {
		Prova<Integer> p = new Prova<Integer>();
		p.foo(4);
		
		Integer x = p.pttt();
		
	}
}
