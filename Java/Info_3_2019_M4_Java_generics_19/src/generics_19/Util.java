package generics_19;

import java.util.List;

public class Util {

	// resituisce se due numeri sono uguali
	// con metodo generico
	static <E extends  Number> boolean equalsNumbers(E n1, E n2) {
		return false;	
	}
	
	// datao un vettore di elementi restitusce il massimo
	// metodo generico 
	
	static <E extends Comparable<E>> E getMax(List<E> elements){
		E max = null;
		for(E i: elements) {
			if (max == null || i.compareTo(max)>0) max = i;
		}
		return max;
	}
	
}
