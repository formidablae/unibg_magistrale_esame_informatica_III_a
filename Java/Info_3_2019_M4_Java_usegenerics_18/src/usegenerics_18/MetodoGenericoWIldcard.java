package usegenerics_18;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoWIldcard {

	/** metodo [non generico] che stampa tutti gli elementi di una lista*/
	
	static void print(List<?> lo) {
		for(Object o : lo) System.out.println(o);
	} 
	
	public static void main(String[] args) {
		//List<Object> lo = new ArrayList<>();
		List<String> lo = new ArrayList<>();
		lo.add("OOO");
		lo.add("kKKKK");
		print(lo);
		
	}


}
