package visitor;

public interface Visitor<T> {

	T visit(MultExpr e);
	T visit(DivExpr e);
	T visit(NumExpr e);
	T visit(PlusExpr e);
	T visit(MinExpr e);
	
}

class Evaluator implements Visitor<Integer>{

	@Override
	public Integer visit(MultExpr e) {
		return e.left.accept(this) * e.right.accept(this);
	}

	@Override
	public Integer visit(DivExpr e) {
		return e.left.accept(this) / e.right.accept(this);
	}

	@Override
	public Integer visit(NumExpr e) {
		return e.val;
	}

	@Override
	public Integer visit(PlusExpr e) {
		return e.left.accept(this) + e.right.accept(this);
	}

	@Override
	public Integer visit(MinExpr e) {
		return e.left.accept(this) - e.right.accept(this);
	}
	
}

