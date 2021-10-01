
public class A implements Cloneable{
	
	int x ;
	
	A(int g){x = g;}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		A a1 = new A(5);
		A a2 = (A) a1.clone();
		System.out.println(a2.x);
	}


}
