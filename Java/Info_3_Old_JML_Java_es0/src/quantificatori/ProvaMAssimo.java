package quantificatori;

public class ProvaMAssimo {
	
	//@ requires a!=null && a.length >= 1;
	//@ ensures (\forall int i ; 0<=i && i < a.length; \result >= a[i]);
	//@ ensures (\exists int i; 0<=i && i < a.length; \result == a[i]);
	int max(int a[]) {
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		ProvaMAssimo pm = new ProvaMAssimo();
		//System.out.println(pm.max(null));
		//System.out.println(pm.max(new int[]{}));
		System.out.println(pm.max(new int[] { 5, 6 }));
	}
}
