package es_fig_sol3_visitor;

import es_fig_sol3_visitor.Cerchio;

// con campo

public class CalcolatoreAreaField implements Visitor {

	double areaCalcolata;

	@Override
	public void visit(Cerchio cerchio) {
		areaCalcolata = cerchio.raggio * cerchio.raggio * Math.PI;

	}

	@Override
	public void visit(Quadrato quadrato) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Rettangolo rettangolo) {
		// TODO Auto-generated method stub

	}

}
