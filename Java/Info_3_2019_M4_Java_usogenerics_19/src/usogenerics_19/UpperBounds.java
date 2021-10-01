package usogenerics_19;

import java.util.ArrayList;
import java.util.List;

class Veicolo implements Comparable<Veicolo>{  
	@Override
	public int compareTo(Veicolo o) {	return 0;}
}
class Auto extends Veicolo{}

public class UpperBounds {

	public static void main(String[] args) {
		printBest(new ArrayList<Veicolo>());
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		System.out.println(a1.compareTo(a2));
		printBest(new ArrayList<Auto>());
	}
	
	static void foo(List<? extends Veicolo> lv) {}
	
//	static <T extends Comparable<T>>  T printBest(List<T> l) {
	static <T extends Comparable<? super T>>  T printBest(List<T> l) {
		T max = null;
		for (T t: l) {
			if (max == null || max.compareTo(t) < 0) {
				max = t;
			}
		}
		return max;
	}
	
}
