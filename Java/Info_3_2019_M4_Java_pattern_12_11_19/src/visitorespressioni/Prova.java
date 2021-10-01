package visitorespressioni;

public class Prova {

	public static void main(String[] args) {
		Espressione due = new Numero(2);
		Espressione tre = new Numero(3);
		Espressione ten = new Numero(10);
		Espressione tp2 = new Somma(tre,due);
		Espressione finale = new Prodotto(tp2, ten);
		Visitor v = null;
		if (Math.random() > 0.5) {
			v = CalcolaValore.instance;
		} else {
			v = new ToString();
		}
		System.out.println(finale.accept(v));
	}

}
