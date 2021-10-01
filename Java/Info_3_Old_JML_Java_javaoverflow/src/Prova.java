public class Prova {

	static int media(int x, int y) {
		//return (x + y) / 2;
		return x + (y -x)/2;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(media(Integer.MAX_VALUE - 2, Integer.MAX_VALUE));
	}

}
