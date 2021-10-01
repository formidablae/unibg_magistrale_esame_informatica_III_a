package quantificatori;
public class CercaMinimo {
	public static void main(String[] args) {

		int a[] = {2,3};
		findMin(a);
	}

	//@requires a != null && a.length >= 1;
	/*@ensures (\forall int i; 
	         0 <= i && i < a.length; 
	         \result < a[i]);@*/
	static int findMin(int a[]) {
		int min = a[0];
		for(int i = 1; i < a.length; i++){
			if (a[i] < min) min = a[i];
		}
		return 4;
	}
}
