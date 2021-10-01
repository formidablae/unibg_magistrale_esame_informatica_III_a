package es_fig_sol3_visitor_param.figure;

import es_fig_sol3_visitor_param.visitor.Visitor;

public class Quadrato extends Rettangolo {
	double lato;

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}
