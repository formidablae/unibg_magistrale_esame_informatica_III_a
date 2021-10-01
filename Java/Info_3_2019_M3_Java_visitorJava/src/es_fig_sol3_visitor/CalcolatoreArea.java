package es_fig_sol3_visitor;

import es_fig_sol3_visitor.Cerchio;

// semplicemente stampa
public class CalcolatoreArea implements Visitor {

	@Override
	public void visit(Cerchio cerchio) {
		System.out.println("V C");
	}

	@Override
	public void visit(Quadrato quadrato) {
		System.out.println("V Q");		
	}

	@Override
	public void visit(Rettangolo rettangolo) {
		System.out.println("V R");
	}
	
}

