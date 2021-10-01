package sedici;
	
class W{
	void m(Object l){System.out.println("W");}
}
class Z extends W{
	void m(Object l){System.out.println("ZO");}
}
public class Test2 {
	public static void main(String[] args) {
		Object a = new Z();
		a.m(a);
	}

}
