package Es2;

import java.util.Arrays;

public class Persona {

	String nome;
	String cognome;
	char[] CF = new char[16];

	public Persona(String nome, String cognome, char[] CF) {
		this.nome = nome;
		this.cognome = cognome;
		this.CF = CF;
	}

	public boolean equals(Persona p) {
		return Arrays.equals(p.CF, CF);
			/*if (p.CF.equals(CF)) --> se uso equals di object anche se i CF sono uguali il risultato è false.
				return true;
		return false;*/
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Persona)// TODO Auto-generated method stub
			return equals((Persona)obj);
		return super.equals(obj);
	}
}
