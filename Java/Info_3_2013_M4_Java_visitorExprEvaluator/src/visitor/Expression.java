package visitor;
public abstract class Expression implements Visitable{}

class NumExpr extends Expression {
	int val;

	static Expression N(int i) {
		return new NumExpr(i);
	}
	NumExpr(int va) {
		val = va;
	}
	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}

abstract class BinExpr extends Expression {
	Expression left, right;

	public BinExpr(Expression l, Expression r) {
		left = l;
		right = r;
	}
}

class PlusExpr extends BinExpr {

	public PlusExpr(Expression l, Expression r) {
		super(l, r);
	}
	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}

class MinExpr extends BinExpr {
	public MinExpr(Expression l, Expression r) {
		super(l, r);
	}
	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}
}

class DivExpr extends BinExpr {
	public DivExpr(Expression l, Expression r) {
		super(l, r);
	}

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}

class MultExpr extends BinExpr {
	public MultExpr(Expression l, Expression r) {
		super(l, r);
	}
	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}
}
