import java.util.ArrayList;
import java.util.List;

class A extends Object{
	int x;
	A(int y){x = y;}
	
	public boolean equals(Object a2) {
		return this.x == ((A)a2).x;
	}
}
public class Prova {
	public static void main(String[] args) {
/*		A a1 = new A(3);
		Object a2 = new A(3);
		System.out.println(a1.equals(a2));*/
		List l = new ArrayList();  
		l.add(new A(3));
		//....
		A b = new A(3);
		System.out.println(l.contains(b));
		
	}

}
