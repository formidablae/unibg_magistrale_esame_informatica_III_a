package es_fig_sol3_visitor;


public abstract class Figura implements Visitable{

	@Override
	public abstract void accept(Visitor v);

}
