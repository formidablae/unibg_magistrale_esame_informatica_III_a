package unibg.math;

// come cingleton
public class MyMath {

	private MyMath(){
	}
	
	static public MyMath instance = new MyMath();
	static public MyMath getMyMath(){
		return instance;
	}
	
	double cos(double s){
		return 0;
	}
	
	
	
}