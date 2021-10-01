import java.util.ArrayList;
import java.util.List;

class Persona{
	protected String nome;
	
	static void printNomi(List<? extends Persona> pp){
		for(Persona p :pp){
			System.out.println(p.nome);
		}
		// stampa nome di persone in pp
	}
}

class Studente extends Persona{
	
}

public class ProvaCovarianza {
	
	public static void main(String[] args) {
		List<Studente> ss = new ArrayList<Studente>();
		// riempio sss
		// voglio stampare i nomi di ss
		Persona.printNomi(ss);
	}

}
