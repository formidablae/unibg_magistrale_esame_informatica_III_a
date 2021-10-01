import java.util.ArrayList;
import java.util.List;


public class WildCard {
	
	/** stampa tutti gli oggetti in l
	 * versione generica con gli Object
	 * @param l
	 */
	static void  printGO(List l){
		for(Object o: l){
			System.out.println(l.toString());
		}		
	} 
	static void  printGen(List<?> l){
		for(Object o: l){
			System.out.println(l.toString());
		}		
	} 
	
	public static void main(String[] args) {
		List o = new ArrayList();
		o.add(new String("pippo"));
		printGO(o);
		// versione geenrica
		List<String> o2 = new ArrayList<String>();
		o2.add(new String("pippo"));
		printGen(o2);
		
	}
	

}
