
public class CalcoloValore implements Visitor {

	@Override
	public void visitNum(Numero n) {
		// TODO Auto-generated method stub
		System.out.println(n.valore);
	}

	@Override
	public void visitPiu(Piu p) {
		// vista il primo operando
		p.op1.accept(this);
		// visita il second operando
		p.op2.accept(this);
		// TODO fa la somma
	}

	@Override
	public void visitPer(Per p) {
		// TODO Auto-generated method stub

	}
	// se voglio restuire un oobject
	public Object visitPer2(Per p) {
		// TODO chiama per le due sottoepressioi
		int x= 0;
		//x = ....
		return new Integer(x);

	}

}
