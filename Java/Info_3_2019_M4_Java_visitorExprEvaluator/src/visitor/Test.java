package visitor;

import static visitor.NumExpr.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Expression e = new DivExpr(new PlusExpr(N(3), N(4)), new MultExpr(N(2),
				N(2)));
		Visitor<Integer> evl = new Evaluator();
		System.out.println(e.accept(evl));
	}

}
