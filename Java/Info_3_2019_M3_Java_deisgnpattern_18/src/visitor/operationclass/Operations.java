package visitor.operationclass;

abstract class Persona{}

class Studente extends Persona{}

class Lavoratore extends Persona{}

class LavoratoreTempoPieno extends Lavoratore{}

// calcolo dello stipendio
/*class CalcoloStipendio{
	
	float stipendio(Studente s){return 780;}
	float stipendio(Lavoratore s){return 1780;}
}*/
// come implemetazione di una interfaccia
interface Operazione{
	float process(Studente s);
	float process(Lavoratore s);	
	float process(LavoratoreTempoPieno s);	
}
class CalcoloStipendio implements Operazione{
	// singleton
	private CalcoloStipendio() {};
	static CalcoloStipendio cs = new  CalcoloStipendio();
	public float process(Studente s){return 780;}
	public float process(Lavoratore s){return 1780;}
	public float process(LavoratoreTempoPieno s){return 1880;}
}

public class Operations {
	public static void main(String[] args) {
		Operazione o = CalcoloStipendio.cs; 
		/*Persona s = new Studente();
		System.out.println(o.process(s));*/
		Lavoratore l = new Lavoratore();
		System.out.println(o.process(l));
		Lavoratore l2 = new LavoratoreTempoPieno();
		System.out.println(o.process(l2));
		
	}
}
