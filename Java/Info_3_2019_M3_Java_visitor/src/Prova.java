
public class Prova {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Automobile punto = new Automobile();
		
		punto.add(new Ruota());
		punto.add(new Ruota());
		punto.add(new Ruota());

		punto.add(new Motore());

		punto.add(new Body());
		
		punto.getPrezzo();

	}

}
