public class Prova {
	public static void main(String[] args) {
		Numero tre = new Numero(3);
		Numero due = new Numero(2);
		Piu p = new Piu(tre, due);
		
		//quanto vale p?
		Espressione e = new Piu(tre, due);
		Visitor cv = new CalcoloValore();
		// calcolare il valore
		e.accept(cv);
		
	}

}
