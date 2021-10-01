import java.util.ArrayList;
import java.util.List;


class A{
	int x;
	A(int y){x = y;}

	public boolean equals(Object o){
		return this.x == ((A)o).x;
	}
}


public class Prova {
	
	public static void main(String[] args) {
		List<A> ll = new ArrayList<A>();
		A a1 = new A(3);
		ll.add(a1);
		A a2 = new A(3);
		System.out.println(a1.equals(a2));
		System.out.println(ll.contains(a2));
	}

}
