
public class Prova2 {

	static void prova(int u, String ...d){
		
	}
// varargs deve essere ultimo
	static void provab(String ...d, int u){
		
	}

	// varargs deve essere unico
	static void prova2(int ...d, String ... b){
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		prova(3,"a","b","b");
		System.out.printf("%d", 3,5,6);
	}

}
