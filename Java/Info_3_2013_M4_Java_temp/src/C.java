import java.io.NotActiveException;
import java.rmi.RemoteException;

import javax.activity.InvalidActivityException;

public class C {

	void m() throws RemoteException{
	}
}

class D extends C {

	@Override
	// 1. ecc come prima OK
	//void m() throws RemoteException{}
	// 2. NO non posso cambiare eccezione
	//void m() throws NotActiveException{}
	// 3. OK: nessuna eccezione (minor numero)
	//void m(){}
	// 4. OK, anche sottoclasse
	void m() throws InvalidActivityException{}
	
}