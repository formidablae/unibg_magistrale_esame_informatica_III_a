import java.util.ArrayList;
import java.util.List;

class Persona{
	String getCodice(){return "";}
}

class Studente extends Persona{}

public class Prova {

	public static void main(String[] args) {
		List<Persona>  popolazione = new ArrayList<>();
		List<Studente> classe = new ArrayList<>();
		stampaPersone(popolazione);
		stampaPersone(classe);
		//
		fooStudenti(popolazione);
		fooStudenti(classe);
		fooStudenti(new ArrayList<Object>());
	}

//	private static void stampaPersone(List<Persona> p){
	private static void stampaPersone(List<? extends Persona> p){
		for(Persona i:p){
			System.out.println(i.getCodice());
		}
	}

	private static void fooStudenti(List<? super Studente> p){
		
	}
	
	
}
