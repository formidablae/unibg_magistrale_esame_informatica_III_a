interface Visitor{
	void visit(Studente s);
	void visit(Lavoratore l);
}


public class AspettativaCalcolatore implements Visitor{

	public void visit(Studente s){
		System.out.println(" studente 100 anni");
	}
	
	public void visit(Lavoratore l){
		System.out.println(" lavoratore 90 anni");		
	}	
}
class CalcoloSalario implements Visitor{

	@Override
	public void visit(Studente s) {
		System.out.println("0");
	}

	@Override
	public void visit(Lavoratore l) {
		System.out.println("1000000000000000");
	}
}

