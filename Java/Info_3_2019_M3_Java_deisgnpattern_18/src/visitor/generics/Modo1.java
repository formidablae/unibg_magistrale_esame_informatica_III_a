package visitor.generics;
// TODO
abstract class Persona{ abstract <T> T accept(Visitor<T> v);}

class Studente extends Persona{
	@Override
	T accept(Visitor<T> v) {
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
interface Visitor <T>{
	T visit(Studente s);
	T visit(Lavoratore s);	
	T visit(LavoratoreTempoPieno s);	
}
class CalcoloStipendio implements Visitor<Float>{
	// singleton
	private CalcoloStipendio() {};
	static CalcoloStipendio cs = new  CalcoloStipendio();
	public Double visit(Studente s){return 780.0;}
	public float visit(Lavoratore s){return 1780;}
	public float visit(LavoratoreTempoPieno s){return 1880;}
}

public class Modo1 {
	public static void main(String[] args) {
		Visitor o = CalcoloStipendio.cs; 
		Persona l = new Lavoratore();
		System.out.println(l.accept(o));
		Lavoratore l2 = new LavoratoreTempoPieno();
		System.out.println(l2.accept(o));
		
	}
}
