package es_fig_sol3_visitor;

import es_fig_sol3_visitor.Cerchio;

public interface Visitor {

	void visit(Cerchio cerchio);

	void visit(Quadrato quadrato);

	void visit(Rettangolo rettangolo);
	

}
