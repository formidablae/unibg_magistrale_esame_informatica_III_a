
public class Counter {
	
	private int count;
	public Counter(){
		count = 0;
	}

	/**
	 * Incrementa il contattore
	 * 
	 * @return il nuovo valore del contatore
	 */
	public int inc() {
		return ++ count;
	}

}
