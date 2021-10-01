package Es2;

public class prova {

	public static void main(String[] args) {
		char[] CF= "aaaaaaaaaaaaaaaa".toCharArray();
		char[] CF2= {'a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a'};
		Object p1=new Persona("aa","bb",CF);
		Persona p2 = new Persona("aa","ee", CF2);
		boolean x = p1.equals(p2);
		System.out.println(x);
	}
}
