package es_fig_sol3_visitor_param.figure;

import es_fig_sol3_visitor_param.visitor.Visitor;


public class Cerchio extends Figura {

	public double raggio;
	
	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visitCerchio(this);		
	}


}
