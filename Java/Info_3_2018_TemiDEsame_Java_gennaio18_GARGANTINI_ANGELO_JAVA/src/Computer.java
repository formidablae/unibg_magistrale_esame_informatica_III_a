
public class Computer implements Comparable<Computer>{
	
	int ID;

	@Override
	public int compareTo(Computer o) {
		return this.ID - o.ID;
	}
	

}
