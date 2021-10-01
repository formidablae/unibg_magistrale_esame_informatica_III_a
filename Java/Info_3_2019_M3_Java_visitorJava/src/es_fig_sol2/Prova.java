package es_fig_sol2;

public class Prova {
	
	public static void main(String[] args) {
			
		Cerchio c = new Cerchio();
		Rettangolo r = new Rettangolo();
		Quadrato q = new Quadrato();
		
		CalcolatoreArea.i.process(c);
		CalcolatoreArea.i.process(r);
		CalcolatoreArea.i.process(q);
		
		Figura f = new Rettangolo();
		CalcolatoreArea.i.process(f);
		Rettangolo rq = new Quadrato();
		CalcolatoreArea.i.process(rq);

		// calcola e stampa l'area
		
	}

}
