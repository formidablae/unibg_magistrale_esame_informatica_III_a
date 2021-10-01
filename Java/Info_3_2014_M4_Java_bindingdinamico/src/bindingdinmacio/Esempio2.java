package bindingdinmacio;

class G{}
class F extends G{}

class S{
	void foo(G a){System.out.println("S");}
}
class T extends S{
	// overloading
	void foo(F b){System.out.println("T");}
}
public class Esempio2 {
	public static void main(String[] args) {
		S s = new T();
		G a = new G();
		s.foo(a); 
		// EB: cerco di S un foo(A) c'è 
		// e lo seleziono
		// LB: cerco in T un foo(A), 
		// non lo trovo, risalgo in A e lì c'è
		F f = new F();
		s.foo(f);
		// EB: cerco in S un foo(F), non cè 
		// seleziono foo(G) (promuovo F a G)
		// LB: cerco in T un foo(G)
	}
	
	
}
