
public class SommaInteri {

	// no varargs
	static int somma(int i1, int i2){
		return i1 +i2;
	}
	// varargs
	static int somma(int ... ai){
		int somma = 0;
		for(int a: ai){
			somma += a;
		}
		return somma;
	}
	
	
	public static void main(String[] args) {
		System.out.println(somma(3,4,5));
		System.out.println(somma(3,4,5,6,7));
	}
	
	
}
