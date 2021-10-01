package te_vistor_nov17;

import java.util.ArrayList;
import java.util.List;

/**
 * @param <T> tipo restituito dalla visita
 */
interface Visitor<T>{
	T visit(Studente s);	
	T visit(Lavoratore l);
}
class GetStipendio implements Visitor<Integer>{
	@Override
	public Integer visit(Studente s) {
		return 0;
	}

	@Override
	public Integer visit(Lavoratore l) {
		return 100;
	}
}

class GetACTIVITY implements Visitor<String>{
	@Override
	public String visit(Studente s) {
		return "studia";
	}

	@Override
	public String visit(Lavoratore l) {
		return "lavora";
	}
}


public class Operazioni {
	
	static int sommaStipendi(List<? extends Persona> lp) {
		GetStipendio visitor = new GetStipendio();
		int somma = 0;
		for(Persona p: lp) {
			somma += p.accept(visitor);
		}
		// java 9 
		//lp.forEach( e -> e.accept(visitor));
		return somma;
	}
public static void main(String[] args) {
	
	Persona s = new Studente();
	Visitor stcalc = new GetStipendio();
	System.out.println(s.accept(stcalc));
	Lavoratore l = new Lavoratore();
	stcalc = new GetACTIVITY();
	System.out.println(s.accept(stcalc));
	List<Persona> lp = new ArrayList<>();
	lp.add(s);
	lp.add(s);
	System.out.println(sommaStipendi(lp));
	List<Lavoratore> ll = new ArrayList<>();
	ll.add(l);
	ll.add(l);
	System.out.println(sommaStipendi(ll));
	
}
}
