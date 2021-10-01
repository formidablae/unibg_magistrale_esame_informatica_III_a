package visitorespressioni;
// operazioni
interface Visitor {
	 private Object visit(Numero n);
	Object visit(Somma n);
	Object visit(Prodotto n);
}

class CalcolaValore implements Visitor{
	// sigleton	
	public static CalcolaValore instance = new CalcolaValore();

	private CalcolaValore() {}
	
	
	@Override
	public Integer visit(Numero n) {
		return n.valore;
	}
	@Override
	public Integer visit(Somma n) {
		return (Integer)n.e1.accept(this) 
				+ (Integer)n.e2.accept(this);
	}

	@Override
	public Integer visit(Prodotto n) {
		return (Integer)n.e1.accept(this) 
				* (Integer)n.e2.accept(this);
	}
}

// expressione e restituisce la stringa
class ToString implements Visitor{

	@Override
	public String visit(Numero n) {
		return String.valueOf(n.valore);
	}
	@Override
	public String visit(Somma n) {
		return "(" +n.e1.accept(this) + "+" + n.e2.accept(this) +")";
	}

	@Override
	public String visit(Prodotto n) {
		return n.e1.accept(this) + "*" + n.e2.accept(this);
	}

	
}
