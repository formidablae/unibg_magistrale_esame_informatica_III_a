package es_fig_sol3_visitor;


public class Rettangolo extends Figura {

	@Override
	public void accept(Visitor v) {
		v.visit(this);		
	}

	
}
