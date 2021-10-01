package deisgnpattern_18;

class MyMath{
	
	double sin(double x) {return 0;}

	double cosin(double x) {return 0;}
	
	// ...
	// sigleton
	private MyMath() {}
	
	/* così creato al momento del load della classe MyMath
	public static MyMath MATH = new MyMath();*/
	
	// variante: creato on demand
	private static MyMath instance;
	public static MyMath MATH() {
		if (instance == null)
			instance = new MyMath();
		return instance;
	}
	
}

public class Singleton {

	public static void main(String[] args) {
		/*MyMath mm = new MyMath();
		mm.sin(50);*/
		//MyMath.MATH.sin(60);
		MyMath.MATH().sin(60);
	}
}
