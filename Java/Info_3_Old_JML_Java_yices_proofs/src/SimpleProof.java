/**
 * a very simple proof
 * 
 * @author garganti
 * 
 */
public class SimpleProof {

	//@ ensures \result == y;
	static int foo(int x, int y) {
		return y;
	}

	public static void main(String[] args) {

		System.out.println(SimpleProof.foo(3, 4));
		

	}
}
