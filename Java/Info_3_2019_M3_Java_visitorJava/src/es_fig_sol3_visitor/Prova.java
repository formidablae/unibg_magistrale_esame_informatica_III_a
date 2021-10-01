package es_fig_sol3_visitor;

import es_fig_sol3_visitor.Cerchio;

public class Prova {
	
	public static void main(String[] args) {
			
		CalcolatoreArea ca = new CalcolatoreArea();
		
		Cerchio c = new Cerchio();
		Rettangolo r = new Rettangolo();
		Quadrato q = new Quadrato();
		c.accept(ca);
		r.accept(ca);
		q.accept(ca);
		
		
		Figura f = new Rettangolo();
		f.accept(ca);

		Rettangolo rq = new Quadrato();
		rq.accept(ca);

		// calcola e stampa l'area
		
	}

}
