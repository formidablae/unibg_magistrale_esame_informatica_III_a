package novisitor;

public class UseNoVitor {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Translate t = new Translate();
		t.process(r);
		
		Rectangle s = new Square();
		t.process(s);
		
		
	}

}
