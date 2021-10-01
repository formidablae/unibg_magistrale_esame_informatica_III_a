package quantificatori;


public class CercaMassimo {
	
	/*@ requires a.length >= 1;
	   ensures (\forall int i; 0 <= i && i < a.length ; \result >= a[i]);@*/
	
	public static int findMax(/*@ non_null @*/ int a[]){
		return Integer.MAX_VALUE;
	}
	/**
	 * wefyio
	 * @param args
	 */
	public static void main(String[] args) {
		int y[] = {10,30};
		System.out.println(findMax(y));		
	}

}
