package usinterfacce;

interface Roulotte{
	int getSpazio();
}
interface Veicolo{
	int getCilindrata();
}


class Camper implements Roulotte, Veicolo{

	@Override
	public int getCilindrata() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpazio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
} 

public class UsoInt2 {

	public static void main(String[] args) {
		Roulotte r = new Camper();
		Veicolo v = new Camper();
	}
	
}
