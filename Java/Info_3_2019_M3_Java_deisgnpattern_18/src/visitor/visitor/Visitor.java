package visitor.visitor;

abstract class Persona{ abstract float accept(Visitor v);}

class Studente extends Persona{
	@Override
	float accept(Visitor v) {
		return v.visit(this);
	}}
class Lavoratore extends Persona{	
	@Override
	float accept(Visitor v) {
	return v.visit(this);
}}
class LavoratoreTempoPieno extends Lavoratore{	
	@Override
	float accept(Visitor v) {
	return v.visit(this);
}}

interface Visitor{
	float visit(Studente s);
	float visit(Lavoratore s);	
	float visit(LavoratoreTempoPieno s);	
}
class CalcoloStipendio implements Visitor{
	// singleton
	private CalcoloStipendio() {};
	static CalcoloStipendio cs = new  CalcoloStipendio();
	public float visit(Studente s){return 780;}
	public float visit(Lavoratore s){return 1780;}
	public float visit(LavoratoreTempoPieno s){return 1880;}
}

public class Visitor {
	public static void main(String[] args) {
		Visitor o = CalcoloStipendio.cs; 
		Persona l = new Lavoratore();
		System.out.println(l.accept(o));
		Lavoratore l2 = new LavoratoreTempoPieno();
		System.out.println(l2.accept(o));
		
	}
}
