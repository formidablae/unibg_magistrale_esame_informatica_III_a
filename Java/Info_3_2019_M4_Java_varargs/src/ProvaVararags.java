import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProvaVararags {
	
	
	static void print(String ... s){
		// s è un array di String cioè String[]
		for(String l:s){
			System.out.print(l + " - ");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		print("pippo");
		print("pippo", " pluto");
		print("pippo", " pluto", " paperino");
		print("pippo", " pluto", " paperino", "qui");
		//
		String[]  qqq = {"qui","quo","qua"};
		print(qqq);
		
		List<String> s = new ArrayList<String>();
		
		print(s.toArray(new String[s.size()]));
	}

}
