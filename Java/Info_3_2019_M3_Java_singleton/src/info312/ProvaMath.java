package info312;

class Math2 {
	
	int Ncalled;

	private Math2() {Ncalled = 0; }

	// 1. public static Math2 instance = new Math2();

	// 2. accesso con metodo
	private static Math2 instance;
	public static Math2 getInstance(){
		if(instance == null)
			instance = new Math2();
		return instance;
	}
	
	double sqrt(double e) {
		Ncalled ++;
		return 0;
	}

}

public class ProvaMath {
	public static void main(String[] args) {
		System.out.println(Math2.getInstance().sqrt(2));
	}
}