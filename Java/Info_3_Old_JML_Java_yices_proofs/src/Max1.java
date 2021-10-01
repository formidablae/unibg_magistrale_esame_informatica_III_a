
public class Max1 {
	
	
	//@ requires true;
	//@ ensures \result >= x && \result >= y;
	//@ ensures \result == x || \result == y;
	//@ ensures (x>=y ) ==> \result == x;
	//@ ensures (y>=x ) ==> \result == y;
	
	static int max(int y, int x){
		if (y >= x){
			//@ assert y >= x;
			return y;
		} else{
			return x;
		}		
	}

	public static void main(String[] args) {
		assert Max1.max(3, 4) == 4;
		System.out.println(Max1.max(4, 3));
		System.out.println(Max1.max(3, 3));
	}
}
