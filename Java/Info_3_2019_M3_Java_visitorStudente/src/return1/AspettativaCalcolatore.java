package return1;

interface Visitor{
	Object visit(Studente s);
	Object visit(Lavoratore l);
}


public class AspettativaCalcolatore implements Visitor{

	public Object visit(Studente s){
		System.out.println(" studente 100 anni");
		return new Integer(100);
	}
	
	public Object visit(Lavoratore l){
		System.out.println(" lavoratore 90 anni");		
		return new Integer(90);
	}	
}
class CalcoloSalario implements Visitor{

	@Override
	public Object visit(Studente s) {
		System.out.println("0");
		return "basso";
	}

	@Override
	public Object visit(Lavoratore l) {
		System.out.println("1000000000000000");
		return "alto";
	}
}

