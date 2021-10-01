package generics.src;
public class Prova {
	public static void main(String[] args) {
		
		int[] a = new int[10];
		for(int i = 0; i <= 10; i++){
			System.out.println(a[i]);
		}
		
		Numero tre = new Numero(3);
		Numero due = new Numero(2);
		Piu p = new Piu(tre, due);
		
		//quanto vale p?
		Espressione e = new Piu(tre, due);
		Visitor<Integer> cv = new CalcoloValore();
		// calcolare il valore
		Integer v = e.accept(cv);
		System.err.println(v);
		
	}

}
