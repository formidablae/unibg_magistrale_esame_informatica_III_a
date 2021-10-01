package es_fig_sol3_visitor_param.figure;

import es_fig_sol3_visitor_param.visitor.Visitable;
import es_fig_sol3_visitor_param.visitor.Visitor;

public abstract class Figura implements Visitable{

	@Override
	public abstract<T> T accept(Visitor<T> v);

}
