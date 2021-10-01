package subtyping_19;

class Persona{}
class Studente extends Persona{}

class Concorso{
	Persona vincitore(){return null;}
}
class ConcorsoBorsadiStudio extends Concorso{
	@Override
	//Persona vincitore(){return null;}
	Studente vincitore(){return null;}
}


public class Covarianza {

	public static void main(String[] args) {
		Persona p = new Studente();
		//
		Persona[] gente = new Studente[10];
		System.out.println(gente.getClass());
		
		Studente[] imieimiglioristudenti = {new Studente(),new Studente()};
		gente = imieimiglioristudenti;
		System.out.println(gente[0].getClass());
		/// cambio del mio studente 0
		gente[0] = new Studente();
		System.out.println(gente[0]);
		System.out.println(imieimiglioristudenti[0]);
		gente[0] = new Persona();
		
		Concorso premi = new ConcorsoBorsadiStudio();
		
		Persona  vinc = premi.vincitore();
	}
}
