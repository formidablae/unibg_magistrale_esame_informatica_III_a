import java.util.Arrays;

/**
 * 4. ListaOrdinata Java Generics Definisci una struttura dati ListaOrdinata che
 * è generica, di elementi ordinabili. Ha sottostante un array (puro di Object –
 * cioè Object[]). Ha i seguenti metodi: 
 • insert che inserisce nella lista in ordine. Se l’array non è abbastanza capiente cosa puoi fare? 
 • toString che restituisce una stringa con gli elementi. Prova a fare un main in cui provi
 * con le stringhe. Se hai una classe Person che è ordinabile e una classe
 * Student che è sottoclasse di Person, riesci a creare ListaOrdinata di
 * Student?
 */
class Person implements Comparable<Person> {

	String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

	@Override
	public String toString() {
		return name;
	}
}

class Student extends Person {
	String matricola;// definisco la matricola

	Student(String ID, String name) {
		super(name);
		this.matricola = ID;
	}

	@Override
	public String toString() {
		return super.toString() + " " + matricola;
	}
}
// importante usare Comparable<? super T>
// se usassi Comparable<T> andrebbe bene per persona ma non per Student
//
public class ListaOrdinata<T extends Comparable<? super T>> {

	private static final int DELTA = 10;
	private static final int SIZE_INIZIALE = 10;
	Object[] array;
	int numElem;

	public ListaOrdinata() {
		// inizializzo l'array con dimensione SIZE_INIZIALE
		array = new Object[SIZE_INIZIALE];
		numElem = 0;
	}

	public void insert(T elem) {
		System.out.println(" " + Arrays.toString(array) + " n " + numElem);
		if (numElem == array.length) {
			// devo creare dello spazio nuovo
			Object[] newArray = new Object[array.length + DELTA];
			// sposto tutti gli elementi nel nuovo array
			for (int i = 0; i < numElem; i++)
				newArray[i] = array[i];
			array = newArray;
		}
		// è possibile inserire il nuovo elemento
		int i;
		// move the i-th element to i+1 (if >= elemen)
		for (i = numElem - 1; i >= 0; i--) {
			// check if <
			if (((T) array[i]).compareTo(elem) < 0) {
				break;
			}
			// shift to +1
			array[i + 1] = array[i];
		}
		array[i + 1] = elem;
		numElem++;
	}

	@Override
	public String toString() {
		String r = "";
		for (int i = 0; i < this.numElem; i++)
			r += array[i].toString() + " ";
		return r;
	}

	public static void main(String[] args) {
		// prova con lo String
		ListaOrdinata<String> lista = new ListaOrdinata<String>();
		lista.insert("Arif");
		lista.insert("Zara");
		lista.insert("Angelo");
		System.out.println(lista.toString());

		// prova con Person
		ListaOrdinata<Person> listaP = new ListaOrdinata<Person>();
		listaP.insert(new Person("Arif"));
		listaP.insert(new Person("Zara"));
		listaP.insert(new Person("Angelo"));
		System.out.println(listaP.toString());

		// prova con Student
		ListaOrdinata<Student> listaS = new ListaOrdinata<Student>();
		listaS.insert(new Student("10", "Arif"));
		listaS.insert(new Student("220", "Zara"));
		listaS.insert(new Student("333", "Angelo"));
		System.out.println(listaS.toString());
	}

}
