package designpattern;

class Rettangolo{
	
	private Rettangolo(int h, int b){
	}
	// factory
	static Rettangolo mkRettangolo(int h, int b){
		if (h==b) return new Quadrato(h);
		else return new Rettangolo(h, b);
	}
}

class Quadrato extends Rettangolo{
	Quadrato (int l){
		super(l,l);
	}
}

public class Factory {
	public static void main(String[] args) {
		// vorrei evitare:
		// creo un rettangolo che sarebbe un quadrato
		Object o = new Rettangolo(4,4);
		Object o = Rettangolo.mkRettangolo(3, 3);
	}

}
