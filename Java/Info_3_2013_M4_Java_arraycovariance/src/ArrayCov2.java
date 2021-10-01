class Persona{}
class Studente extends Persona{}

public class ArrayCov2 {
	public static void main(String[] args) {
		Studente[] ss = new Studente[10];
		Persona[] pp = ss;
		pp[0] = new Persona();
	}

}
