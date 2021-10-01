
public class Prova {
	public static void main(String[] args) {
		Studente s = new Studente();
		AspettativaCalcolatore a = new AspettativaCalcolatore();
		s.accept(a);
		//
		Persona p = new Lavoratore();
		Visitor v = new AspettativaCalcolatore();
		p.accept(v);
		
		
	}

}
