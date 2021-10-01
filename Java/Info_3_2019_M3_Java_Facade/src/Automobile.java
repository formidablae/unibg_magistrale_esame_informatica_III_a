class Motore{
	int cilindrata(){return 0;}
}
class Carrozzeria{
	String getColore(){return "ROSSO";}
}
class Autoradio{
	boolean hasRDS(){return true;}
}

public class Automobile {
	private Motore motore;
	Carrozzeria car;
	Autoradio radio;
	int cilindrata(){return motore.cilindrata();}
	
}

class B{
	
	private void mmm() {
		Automobile a = new Automobile();
		a.cilindrata();

	}
	
}