interface Visitable{
	void accept(Visitor v);
}

public abstract class Persona implements Visitable{

}

class Studente extends Persona {
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}

class Lavoratore extends Persona{
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}	
}