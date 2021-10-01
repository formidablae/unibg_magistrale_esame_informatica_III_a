package es_fig_sol3_visitor_param.visitor;

import es_fig_sol3_visitor_param.figure.*;

public interface Visitor<T> {

	T visitCerchio(Cerchio cerchio);

	T visit(Quadrato quadrato);

	T visit(Rettangolo rettangolo);

}
