
public class Algoritm {
	
	// errore , solo lista computer con computer
	//static Computer getFirst(ListaComputer<Computer> lc){
	//
	// sconsigliato
	//static Computer getFirst(ListaComputer<? extends Computer> lc){
	// ok
	static <T extends Computer> T getFirst(ListaComputer<T> lc){
		return lc.get(0);
	}

}
