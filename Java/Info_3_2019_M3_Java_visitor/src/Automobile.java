import java.util.ArrayList;
import java.util.List;


public class Automobile {

	public List<Part> parti;
	
	public Automobile(){
		parti = new ArrayList<Part>();
	}

	public void add(Part p) {
		parti.add(p);
		
	}

	public int getPrezzo() {
		
		CalcolaPrezzo cp = new CalcolaPrezzo();
		int totale = 0;
		
		for (Part p : parti){
			// get prezzo di p e somma
			totale += p.accept(cp);
			
		}
		return totale;
	}
	
}
