package visitor;
// LATO VISITOR, con le operazioni
interface Visitor {
	void visit(Rectangle r);
	void visit(Square s);
	void visit(Circle c);
}
class Translate implements Visitor {

	@Override
	public void visit(Rectangle r) {
		System.out.println("translating rectangle");}

	@Override
	public void visit(Circle c) {
		System.out.println("translating circle");
	}
	@Override
	public void visit(Square c) {
		System.out.println("translating square");
	}
} 