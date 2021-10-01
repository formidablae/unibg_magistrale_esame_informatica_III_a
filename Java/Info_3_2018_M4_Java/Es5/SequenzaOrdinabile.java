package Es5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SequenzaOrdinabile<E extends Comparable<E>> {

	ArrayList<E> array=new ArrayList<>();

	public SequenzaOrdinabile() {
		// TODO Auto-generated constructor stub
	}

	void insert(E e) {
		array.add(e);
	}
	
	void stampa() {
		for (E c: array)
			System.out.println(c.toString());
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void bubbleSort() {
		boolean needNextPass = true;

		for (int k = 1; k < array.size() && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < array.size() - k; i++) {
				if (array.get(i).compareTo(array.get(i+1)) > 0) {
					// Swap list[i] with list[i + 1]
					E temp = array.get(i);
					array.set(i, array.get(i+1));
					array.set(i+1, temp);

					needNextPass = true; // Next pass still needed
				}
			}
		}
	}
}
