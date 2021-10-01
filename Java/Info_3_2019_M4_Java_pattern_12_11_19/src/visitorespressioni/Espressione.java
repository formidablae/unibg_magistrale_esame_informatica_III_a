package visitorespressioni;
// lato vistable
interface Visitable{
	Object accept(Visitor v);
}

public abstract class Espressione implements Visitable{}
class Numero extends Espressione {
	int valore;
	Numero(int v){valore = v;}
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
abstract class EspressioneBinaria extends Espressione {
	Espressione e1,e2;
	EspressioneBinaria(Espressione e1, Espressione e2){
		this.e1 = e1;
		this.e2 = e2;
	}
}

class Somma extends EspressioneBinaria {
	Somma(Espressione e1, Espressione e2) {
		super(e1, e2);
	}

	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
class Prodotto extends EspressioneBinaria {
	Prodotto(Espressione e1, Espressione e2) {
		super(e1, e2);
	}
	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
