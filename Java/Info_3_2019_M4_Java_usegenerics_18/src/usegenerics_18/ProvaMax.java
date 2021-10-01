package usegenerics_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Automobile implements Comparable<Automobile> {
	@Override
	public int compareTo(Automobile o) {
		return 0;
	}
}
class LuxuryCar extends Automobile{}

public class ProvaMax {

	public static void main(String[] args) {
		Automobile fiatUno = new Automobile();
		Automobile rangeROver = new Automobile();
		List<Automobile> mycars = Arrays.asList(fiatUno, rangeROver);
		MetodoGenerico.max(mycars);
		
		LuxuryCar ferrari = new LuxuryCar();
		LuxuryCar rolls = new LuxuryCar();
		System.out.println(ferrari.compareTo(rolls));
		List<LuxuryCar> myWifeCars = new ArrayList<>();
		MetodoGenerico.max(myWifeCars);
		
	}

}
