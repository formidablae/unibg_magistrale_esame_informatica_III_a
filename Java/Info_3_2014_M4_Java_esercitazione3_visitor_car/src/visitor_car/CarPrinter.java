package visitor_car;

public class CarPrinter implements Visitor<Boolean>{

	@Override
	public Boolean visit(Ruota r) {
		System.out.println("ruota" + r.pos);
		return true;
	}

	@Override
	public Boolean visit(Car c) {
		c.motore.accept(this);
		c.carrozzeria.accept(this);
		for( Ruota r: c.ruote)
			r.accept(this);
		return true;
	}

	@Override
	public Boolean visit(Motore r) {
		System.out.println("motore");
		return true;
	}

	@Override
	public Boolean visit(Carrozzeria r) {
		System.out.println("carrozzeria");
		return true;
	}

	public static void main(String[] args) {
		Car punto = new Car();
		CarPrinter cp = new CarPrinter();
		punto.accept(cp);
	}
	
}
