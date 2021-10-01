package bindingdinmacio.studenti;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Persona {
	String cf;

	public Persona(String s) {
		cf = s;
	}
	public boolean equals(Persona p2) {
		return cf.equals(p2.cf);
	}
	@Override
	public boolean equals(Object p2) {
		if (this == p2) return true;
		if (p2 instanceof Persona){
			return equals((Persona)p2);
		}
		return false;
	}
		
	@Override
	public int hashCode() {
		return cf.hashCode();
	}
	

	public static void main(String[] args) {
		Persona p1 = new Persona("GRG");
		Persona p2 = new Persona("ABB");
		//System.out.println(p1.equals(p2));
		List<Persona> cl = new ArrayList<>();
		cl.add(p1);
		cl.add(p2);
		Persona o2 = new Persona("ABB");
		System.out.println(cl.contains(o2));
		// 
		HashSet<Persona> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		System.out.println(set.contains(o2));
		
	}

}
