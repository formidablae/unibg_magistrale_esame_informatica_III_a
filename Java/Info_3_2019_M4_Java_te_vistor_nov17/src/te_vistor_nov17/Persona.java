package te_vistor_nov17;

interface Visitable{
	<T> T accept(Visitor<T> v);
}

abstract public class Persona implements Visitable {

}

class Studente extends Persona{
	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}}

class Lavoratore extends Persona{	@Override
	public <T> T accept(Visitor<T> v) {
	return v.visit(this);
}}

