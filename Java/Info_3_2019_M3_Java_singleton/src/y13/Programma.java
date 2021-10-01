package y13;

class DataBase {

	private DataBase(){
		// 
	}
	// alt1
	final static DataBase instance = new DataBase();
	// alt2
	static private DataBase b;
	final static DataBase getInstance(){
		if (b == null) b = new DataBase();
		return b;
	}
	
}

public class Programma{
	public static void main(String[] args) {
		DataBase db = DataBase.instance;
		DataBase db2 = DataBase.instance;
	}
	
}