package es_fig_sol3_visitor;


public class Cerchio extends Figura {

	public double raggio;
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);		
	}

}
