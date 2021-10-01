package es_fig_sol3_visitor;


public class Quadrato extends Rettangolo {
	double lato;

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
