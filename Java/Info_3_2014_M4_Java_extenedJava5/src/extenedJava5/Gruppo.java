package extenedJava5;



// un insieme di ....
public class Gruppo {

	Object[] data = new Object[20];
	int index = 0;
	
	void aggiungi(Object o){
		data[index++] = o;		
	}
	
	Object preleva(){
		return data[--index];
	}
	
	
	public static void main(String[] args) {
		// Gruppo di stringhe
		Gruppo gds = new Gruppo();
		gds.aggiungi("pippo");
		System.out.println(gds.preleva());
		// problemi
		// 1. non ho garanzia su quello che viene inserito
		gds.aggiungi(new Integer(30));
		// 2. quando prelevo non so cosa ho
		String k = (String) gds.preleva();
		
	}
	
	
}

// SOLUZIONE PROGRA GENERICA SENZA PARAMETRI
// SE AVESSI VOLUTO un gruppo di stringhe

class GruppoString extends Gruppo{
	
	@Override
	void aggiungi(Object o) {
		if (o instanceof String)
			super.aggiungi(o);
		else {
			// ERRORE
		}
	}
	@Override
	String preleva(){
		return super.preleva();
	}
	
	
	
}




