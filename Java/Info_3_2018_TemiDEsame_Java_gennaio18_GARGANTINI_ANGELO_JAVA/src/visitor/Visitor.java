package visitor;

public interface Visitor {
	
	int visit(NumberLiteral nl);
	
	int visit(Prodotto nl);

	int visit(Somma nl);
}
