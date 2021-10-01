import java.util.Collections;

class ListaOrdinata<T extends Comparable<? super T>>{
	
	void add(T t){
		// confrontare t con quelli nella lista
		T o = null;
		t.compareTo(o);
	}
}

class Persona implements Comparable<Persona>{

	@Override
	public int compareTo(Persona arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
} 

class Studente2 extends Persona{
	
}

public class CompProva {
public static void main(String[] args) {
	ListaOrdinata<Persona> popolazione = new ListaOrdinata<Persona>();
	ListaOrdinata<Studente2> classe = new ListaOrdinata<Studente>();
}
}
