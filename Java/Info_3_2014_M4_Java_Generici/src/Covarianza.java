import java.util.ArrayList;


class Persona{
	int getEta(){return 0;}
}

class Studente extends Persona{}

public class Covarianza {

	public static void main(String[] args) {
		Persona p = new Studente();
		// NON non c'è covarianza
		//ArrayList<Persona> gr = new ArrayList<studente>();
		ArrayList<Persona> gr = new ArrayList<Persona>();
		primo(gr);
		ArrayList<Studente> cl = new ArrayList<Studente>();
		printEta(cl);
	}

	// stampa il primo elemento in un arraylist
	// NO static void primo(ArrayList<Object> o){
	static void primo(ArrayList<?> o){
		System.out.println(o.get(0).toString());
	}
	
	// stampa tutte le eta
	// NO per covarianza ch enon c'è static void printEta(ArrayList<Persona> o){
	// NO percheè non ho persone in o
	//static void printEta(ArrayList<?> o){
	// Sì con vincoli
	static void printEta(ArrayList<? extends Persona> o){
		for(Persona p: o){
			System.out.println(p.getEta());
		}
	}
	
		
	
	
}
