package es_fig_sol3_visitor_param.visitor;

public interface Visitable {

	<T> T accept(Visitor<T> v);
}
