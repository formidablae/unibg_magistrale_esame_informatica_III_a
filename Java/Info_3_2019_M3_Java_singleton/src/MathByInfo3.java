import unibg.math.MyMath;


public class MathByInfo3 {
	
	private MathByInfo3(){}
	
	private static MathByInfo3 instance = new MathByInfo3();
	
	public static MathByInfo3 getMath(){
		return instance;
	}
	
	double sin(double s){return 0;}

	double cos(double s){return 0;}

	double log(double s){return 0;}
}
class Prova{
	
	public static void main(String[] args) {
		MathByInfo3.instance.sin(0);
		
	}
}