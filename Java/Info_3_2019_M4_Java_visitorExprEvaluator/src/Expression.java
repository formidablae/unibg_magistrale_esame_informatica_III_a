public abstract class Expression {
	abstract int eval();	
	public static void main(String[] args) {
		Expression e = 
				new DivExpr(new PlusExpr(N(3),N(4)), new MultExpr(N(2), N(2)));
		System.out.println(e.eval());
	}
	private static Expression N(int i) {
		return new NumExpr(i);
	}
}

class NumExpr extends Expression {
	int val;

	NumExpr(int va) {
		val = va;
	}

	@Override
	int eval() {
		return val;
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
	int eval() {
		return left.eval() + right.eval();
	}
}

class MinExpr extends BinExpr {
	public MinExpr(Expression l, Expression r) {
		super(l, r);
	}

	@Override
	int eval() {
		return left.eval() - right.eval();
	}
}

class DivExpr extends BinExpr {
	public DivExpr(Expression l, Expression r) {
		super(l, r);
	}

	@Override
	int eval() {
		return left.eval() / right.eval();
	}
}

class MultExpr extends BinExpr {
	public MultExpr(Expression l, Expression r) {
		super(l, r);
	}

	@Override
	int eval() {
		return left.eval() * right.eval();
	}
}
