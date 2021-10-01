package es_fig_sol1;

public class Prova {
	
	public static void main(String[] args) {
			
		Cerchio c = new Cerchio();
		Rettangolo r = new Rettangolo();
		Quadrato q = new Quadrato();
		
		c.calcolaArea();
		r.calcolaArea();
		q.calcolaArea();
		
		Figura f = new Rettangolo();
		Rettangolo rq = new Quadrato();

		// calcola e stampa l'area
		f.calcolaArea();
		rq.calcolaArea();
	}

}
