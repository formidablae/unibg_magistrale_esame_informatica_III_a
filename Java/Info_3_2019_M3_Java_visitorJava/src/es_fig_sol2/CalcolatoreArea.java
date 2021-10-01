package es_fig_sol2;

public class CalcolatoreArea {

	static CalcolatoreArea i = new CalcolatoreArea();

	private CalcolatoreArea() {
	}

	void process(Quadrato q) {
		System.out.println("ca Q");
	}

	void process(Rettangolo q) {
		System.out.println("ca R");
	}

	void process(Cerchio q) {
		System.out.println("ca C");
	}

	public void process(Figura f) {
		if (f instanceof Rettangolo) {
			Rettangolo r1 = (Rettangolo) f;
			process(r1);
		}
		// e cos' via
		// TODO Auto-generated method stub
		
	}

}
