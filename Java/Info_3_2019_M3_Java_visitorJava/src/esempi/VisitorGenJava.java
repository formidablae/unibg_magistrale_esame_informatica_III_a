package esempi;
import java.util.Vector;

// Visitor qualsiasi di studenti dei due tipi
interface StudVisitor<T> {

	// i metodi visit sono astratti
	// uso due nomi distinti per distinguerli meglio
	T visitS1L(Studente1L x);

	T visitSLS(StudenteLS x);

};

/** visitor specifico per il colcolo della media */
class CalcolaMedia implements StudVisitor<Double> {

	// calcolo delle media per Studente primo livello
	public Double visitS1L(Studente1L x) {
		// dovrò interrogare x che so che è di tipo Studente1L
		// TODO
		System.out.println("calcolo la media dello studente primo livello");
		return 0.0;
	}

	// calcolo delle media per Studente specialistico
	public Double visitSLS(StudenteLS x) {
		// TODO
		// dovrò interrogare x che so che è di tipo StudenteLS
		System.out.println("calcolo la media dello studente scpecialistica");
		return 0.0;
	}

}

abstract class Studente {

	Studente() {
	}

	abstract <T> T accept(StudVisitor<T> v);

}

class Studente1L extends Studente {

	Studente1L() {
	}

	<T> T accept(StudVisitor<T> v) {
		return v.visitS1L(this);
	}

}

class StudenteLS extends Studente {

	StudenteLS() {
	}

	<T> T accept(StudVisitor<T> v) {
		return v.visitSLS(this);
	}

}

public abstract class VisitorGenJava {

	public static void main(String[] args) {

		// dichiaro un array di ptr a Studenti
		// uso i puntatori per il binding dinamico
		Vector<Studente> classeMista = new Vector<Studente>();
		classeMista.add(new Studente1L());
		classeMista.add(new StudenteLS());
		CalcolaMedia calc = new CalcolaMedia();
		// chiamo accept del calcolo
		// il pattern adrà tramite il double dispatch a prendere il corpo del
		// metodo adatto
		classeMista.elementAt(0).accept(calc);
		classeMista.elementAt(1).accept(calc);
	}

}
