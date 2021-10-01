package visitor;

public class ProvaVisitor {

	public static void main(String[] args) {
		NumberLiteral tre = new NumberLiteral(3);
		NumberLiteral quat = new NumberLiteral(4);
		NumberLiteral cinq = new NumberLiteral(5);
		Prodotto p = new Prodotto(quat, cinq);
		Somma s = new Somma(tre, p);
		//
		System.out.println(s.accept(new Evaluator()));
		
	}

}
