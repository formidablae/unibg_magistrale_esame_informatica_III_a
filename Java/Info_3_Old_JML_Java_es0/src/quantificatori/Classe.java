package quantificatori;

import java.util.ArrayList;
import java.util.List;

public class Classe {

	//@ invariant (\forall int i; 0 <= i && i < stArray.length ; ((stArray[i] != null) ==> stArray[i].matricola > 0));
	Studente[] stArray= new Studente[10];
	
    void addStudent(Studente s){
    	stArray[0] = s;
    }
	
	//@ invariant (\forall int i; 0 <= studenti.size() ;studenti.get(i).matricola > 0);
 	List<Studente> studenti;

	Classe(){
		studenti = new ArrayList<Studente>();
	}
	public static void main(String[] args) {
		Classe info3 = new Classe();		
		info3.studenti.add(new Studente("mio", 0));
		System.out.println(info3.studenti.toString());
		info3.addStudent(new Studente("mio", 0));
	}
}
