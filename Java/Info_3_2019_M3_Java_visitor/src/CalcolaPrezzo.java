
public class CalcolaPrezzo implements Visitor<Integer>{

	@Override
	public Integer visit(Motore m) {
		System.out.println(" calcolo prezzo del motore");
		return 1000;
		
	}

	@Override
	public Integer visit(Ruota r) {
		System.out.println(" calcolo prezzo della ruota");
		return 100;
	}

	@Override
	public Integer visit(Body b) {
		System.out.println(" calcolo prezzo del mbody");
		return 2000;
	}

}
