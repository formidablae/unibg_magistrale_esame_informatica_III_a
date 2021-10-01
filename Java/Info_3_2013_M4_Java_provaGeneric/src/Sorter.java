import java.util.ArrayList;
import java.util.List;

class Util{
	// max tra a e b
	static <T extends Comparable<? super T>> T max(T a,T b){
		if (a.compareTo(b) >= 0) return a;
		else return b;
	}
	
	static Object max2(Comparable a, Comparable b){
		if (a.compareTo(b) >= 0) return a;
		else return b;
	}
}

class Persona implements Comparable<Persona>{
	@Override
	public int compareTo(Persona o) {return 0;}
}

class Studente extends Persona{
	
	<T extends Comparable<? super Persona>> T p(T a){}
	
}

public class Sorter<T extends Comparable<? super T>> {
	public void sort(List<T> list) {
		boolean ordered = true;
		int i = 0;
		do {
			// ...
			if (list.get(i).compareTo(list.get(i + 1)) > 0) // ..
			{}
		} while (!ordered);
	}
	
	public static void main(String[] args) {
		List<String> parole = new ArrayList<>();
		Sorter sorter = new Sorter<String>();
		sorter.sort(parole);
		
		List<Persona> gruppo = new ArrayList<>();
		Sorter<Persona> sorterP = new Sorter<>();
		sorterP.sort(gruppo);
		
		List<Studente> classe = new ArrayList<Studente>();
		Sorter<Studente> sorteS = new Sorter<>();
	}

}
