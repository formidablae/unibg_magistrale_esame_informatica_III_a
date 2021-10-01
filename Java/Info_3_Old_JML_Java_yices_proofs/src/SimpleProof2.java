
public class SimpleProof2 {
	
	
	//@ ensures (x >= y ==> \result == x) && (x <= y ==> \result == y);
	static int max(int x, int y){
		if (x >= y) return 0;
		else return y;
	}
	
	public static void main(String[] args) {
		
		System.out.println(SimpleProof2.max(3,4));
		System.out.println(SimpleProof2.max(4,3));
		
	}
}
