package usofinalize;

class Persona{}

class Studente extends Persona{ void f(){}}

public class Eredita {
	public static void main(String[] args) {
		
		Persona[] gruppo = new Persona[10];
		Studente[] classe = new Studente[20];
		classe[0] = new Studente();
		classe[0].f();
		gruppo = classe;
		gruppo[0] = new Persona();
		classe[0].f();
		
		
		
	}


}
