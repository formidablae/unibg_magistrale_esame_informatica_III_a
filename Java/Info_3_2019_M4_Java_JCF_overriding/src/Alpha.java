// class Object
//	public boolean equals(Object o){

//
public class Alpha extends Object {

	String n;
	
	Alpha(String name){
		n = name;
	}
	// due alfa sono uguali se hanno n uguale (ignar ail case
	
	public boolean equals(Alpha o){
		return this.n.equalsIgnoreCase(o.n);
	}
	@Override
	public boolean equals(Object arg0) {
		if ( arg0 instanceof Alpha){
			return this.n.equalsIgnoreCase(((Alpha)arg0).n);
		} else
			return false;
	}
	
	
	public static void main(String[] args) {
		
		Alpha a = new Alpha("PIPPO");
		Alpha b = new Alpha("pippo");
		
		System.out.println(a.equals(b) + " = true?");
		
		// 
		Object o1 = new Alpha("angelo");
		Alpha o2 = new Alpha("AnGeLO");
		System.out.println(o1.equals(o2) + " = true?");
		
		
	}
}
