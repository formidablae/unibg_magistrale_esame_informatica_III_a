import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Persona implements Comparable<Persona>{

	String nome;
	
	public String getNome(){
		return "nome";
	}

	@Override
	public int compareTo(Persona arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

class Studente extends Persona{
	
}

public class Prova {

	static void print(Collection<? extends Persona> listaP){
		for( Persona p: listaP){
			System.out.println(p.getNome());
		}
	}

	public static void main(String[] args) {
		Collection<Persona> listaP = new ArrayList<Persona>();
		
		listaP.add(new Persona());
		listaP.add(new Studente());

		Collections.sort((List<Persona>)listaP);
		
		print(listaP);
		
		
		///
		List<Studente> classe = new ArrayList<Studente>();
		
		Collections.sort(classe);
		
		print(classe);
		
		
	}

}
