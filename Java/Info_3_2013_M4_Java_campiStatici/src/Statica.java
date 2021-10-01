public class Statica {

	static int a = 0;

	static int b = a;

	static int g;

	static int h = g;

	static {
		System.out.println(" static");
		h = 60;
	}
}
