package Es5;

public class prova {

	public static void main(String[] args) {
		SequenzaOrdinabile<Integer> seq = new SequenzaOrdinabile<Integer>();
		
		/*seq.insert("prova");
		seq.insert("prova5");
		seq.insert("prova4");*/
		
		seq.insert(4);
		seq.insert(3);
		seq.insert(6);
		
		seq.stampa();
		
		seq.bubbleSort();
		
		seq.stampa();
	}
}
