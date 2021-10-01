package visitor_car;

abstract class CarElement implements Visitable {

}

class Ruota extends CarElement {

	String pos;

	Ruota(String s){ pos = s;}

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}

class Motore extends CarElement {
	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}

class Carrozzeria extends CarElement {
	
	String colore;
	
	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}

public class Car implements Visitable {
	Ruota[] ruote;
	Motore motore;
	Carrozzeria carrozzeria;

	Car() {
		motore = new Motore();
		ruote = new Ruota[] { new Ruota("ADX"), new Ruota("ASX"),
				new Ruota("PDX"), new Ruota("PSX") };
		carrozzeria = new Carrozzeria();
	}

	@Override
	public <T> T accept(Visitor<T> v) {
		return v.visit(this);
	}

}
