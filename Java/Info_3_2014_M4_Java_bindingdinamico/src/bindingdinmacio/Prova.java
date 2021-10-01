package bindingdinmacio;

import java.util.Random;

class Persona{
	
	void echo(int x){System.out.println("Ciao");}
}

class Studente extends Persona{
	void echo(long x){System.out.println("Aloa");}	
}

public class Prova {
	public static void main(String[] args) {
		Persona p = new Persona();
		//p.echo();
		Studente s = new Studente();
		//s.echo();
		Random rnd = new Random();
		if (rnd.nextBoolean()){
			p = s;
		}
		p.echo(6);
	}

}
