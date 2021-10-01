package extenedJava5;



// un insieme di ....
public class GruppoGenerico<E> {

	Object[] data = new Object[20];
	int index = 0;
	
	void aggiungi(E o){
		data[index++] = o;		
	}
	
	E preleva(){
		return (E) data[--index];
	}
	
	
	public static void main(String[] args) {
		// Gruppo di stringhe
		GruppoGenerico<String> gds = new GruppoGenerico();
		gds.aggiungi("pippo");
		System.out.println(gds.preleva());
		// problemi
		// 1. non ho garanzia su quello che viene inserito
		//gds.aggiungi(new Integer(30));
		// 2. quando prelevo non so cosa ho
		//String k = (String) gds.preleva();
		String k = gds.preleva();		
	}
	
	
}
