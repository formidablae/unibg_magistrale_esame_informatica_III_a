package generics_19;

public class Coppia<E,F> {
	E e;
	F f;
	// NO F[] arraydif = new F[10];
	Coppia (E e, F f){
		this.e = e;
		this.f = f;
	}

	public static void main(String[] args) {
		Coppia<Integer, String> n = hashPUpper("ciao");
		System.out.println(n.e);
		System.out.println(n.f);
		
	}
	
	// restitusce data una stringa il suo hash e la stringa 
	// tutta maiuscola
	
	public static Coppia<Integer,String> hashPUpper(String s){
		return new Coppia<Integer,String>(s.hashCode(), s.toUpperCase()); 
		
	}
}
