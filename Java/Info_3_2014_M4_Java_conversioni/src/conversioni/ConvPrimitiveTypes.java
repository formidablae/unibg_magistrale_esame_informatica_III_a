package conversioni;

public class ConvPrimitiveTypes {

	public static void main(String[] args) {
		// implicite da sottotipo a supertipo
		// tipi primitivi
		int x = 0;
		long l = 200088777899999999L;
		double d = l;
		System.out.println(l + " - " +d);
		
		short s = 1000; 
		
		//
		long j = 900000000999999999L;
		int k = (int)j;
		System.out.println(j + " - " +k);
		

	}

}
