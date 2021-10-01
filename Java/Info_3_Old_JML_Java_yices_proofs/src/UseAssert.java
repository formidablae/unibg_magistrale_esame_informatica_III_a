
public class UseAssert {
	
	
	/*@ ensures (x>=y ==> \result == x) && 
	    (x <=y ==> \result == y);
	 @*/
	static int max(int x, int y){
		if (x > y){
			//@ assert x < y;
			return x;
		} else{
		    return y;
		}
	}


}
