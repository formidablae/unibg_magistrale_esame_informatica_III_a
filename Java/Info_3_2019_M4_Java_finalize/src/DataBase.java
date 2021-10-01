
public class DataBase {

	DataBase(){
		// creo connessione
		System.out.println("db connesso");
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("db SCONNESSO");
	}
}
