public class ProvaSegnali {

	static public boolean go(int x, int y, boolean c) {
		int z = y * 2 + 10;
		int j = x + 3;
		if ((z > 0 && j == 70) || c) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// copertura istruzioni
		go(7, 0, true); // copre return true
		go(7, -10, false); // copre return false
		// copertura archi
		// già fatto dalle precedenti
		// copertura condizioni
		go(67, -10, true);
		// copertrua condizioni/decisioni
		// già fatto
		// copertura MCDC
		go(67, 0, false);
		//go(67, -10, false);
		//go(7, 0, false);
		System.out.println("finito");
	}
}
