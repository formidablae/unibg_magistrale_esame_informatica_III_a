import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Persona {}
class Studente extends Persona{}

public class ProvaGenericiCovarianza {
	
	static void stampaDatiPersona(List<? extends Persona> p){
		Persona pp = p.get(0);
	}
	
	public static void main(String[] args) {
		List<Persona> pop = new ArrayList<Persona>();
		// NOOO pop = new ArrayList<Studente>();
		List<Studente> classe = new LinkedList<Studente>();
		stampaDatiPersona(pop);
		stampaDatiPersona(classe);
		stampaDatiPersona(new ArrayList<String>());
		
	}
	
	

	
}
