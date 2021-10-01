package usofinalize;

class DBConnection{
	public DBConnection() {
		System.out.println("crea connessione");
	}
	public void writeData(String string) {
		System.out.println("write data");
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("oggetto distrutto");
	}
}

public class UsoFinalize {

	static void insertData(){
		DBConnection db = new DBConnection();
		db.writeData("miei dati");
		// in C++ dovrei fare
		//free db;
	}

	public static void main(String[] args) {
		insertData();
		//System.out.println("chiama gc");
		Runtime.getRuntime().gc();
		//System.out.println("finito gc");
	}
	
}
