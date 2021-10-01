package generics.src;


public class CalcoloValore implements Visitor<Integer> {

	@Override
	public Integer visitNum(Numero n) {
		return n.valore;
	}

	@Override
	public Integer visitPiu(Piu p) {
		// vista il primo operando
		int v1 = p.op1.accept(this);
		// visita il second operando
		int v2 = p.op2.accept(this);
		// fa la somma
		return v1 + v2;
	}

	@Override
	public Integer visitPer(Per p) {
		// vista il primo operando
		int v1 = p.op1.accept(this);
		// visita il second operando
		int v2 = p.op2.accept(this);
		// fa la somma
		return v1 * v2;
	}
}
