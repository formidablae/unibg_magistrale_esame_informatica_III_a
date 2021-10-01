package provaGeneric;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Persona implements Comparable<Persona>{
	@Override
	public int compareTo(Persona arg0) {
		return 0;
	}}
class Studente extends Persona{}

public class ProvaGenericiCovarianza {

	static <T  extends Comparable<? super T>> boolean isMaggiore(T c1, T c2){
		return c1.compareTo(c2)> 0;
	}
	
	static void stampaDatiPersona(List<? extends Persona> p){
		Persona pp = p.get(0);
	}
	
	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		isMaggiore(p1, p2);
		Studente s1 = new Studente();
		Studente s2 = new Studente();
		isMaggiore(s1, s2);
		
		
		List<Persona> pop = new ArrayList<Persona>();
		// NOOO pop = new ArrayList<Studente>();
		List<Studente> classe = new LinkedList<Studente>();
		stampaDatiPersona(pop);
		stampaDatiPersona(classe);
		stampaDatiPersona(new ArrayList<String>());
		
	}
	
	

	
}
