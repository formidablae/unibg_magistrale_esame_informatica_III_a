
class Personaggio implements Comparable<Personaggio>{
	@Override
	public int compareTo(Personaggio arg0) {
		return 0;
	}	
}
class Studentista extends Personaggio{}


class ListOrdinata<E extends Comparable<? super E>>{
	
	void ordina(){
		E e1 = null;
		E e2 = null;
		//...
		e1.compareTo(e2);
	}
	
	public static void main(String[] args) {
		ListOrdinata<Personaggio> lop;
		Studentista s = new Studentista();
		s.compareTo(s);
		ListOrdinata<Studentista> st;
	}
}


