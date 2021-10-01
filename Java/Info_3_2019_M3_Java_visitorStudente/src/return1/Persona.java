package return1;
interface Visitable{
	Object accept(Visitor v);
}

public abstract class Persona implements Visitable{

}

class Studente extends Persona {
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}

class Lavoratore extends Persona{
	@Override
	public Object  accept(Visitor v) {
		return v.visit(this);
	}	
}