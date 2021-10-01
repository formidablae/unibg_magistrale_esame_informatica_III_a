import javax.swing.ListCellRenderer;


public class Prova {

	public static void main(String[] args) {
		ListaComputer<Computer> lc = new ListaComputer<>();
		ListaComputer<Notebook> ln = new ListaComputer<Notebook>();
		
		Algoritm.getFirst(lc);
		Notebook g = Algoritm.getFirst(ln);
	}

}
