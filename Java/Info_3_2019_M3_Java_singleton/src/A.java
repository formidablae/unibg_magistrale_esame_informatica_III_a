
public class A {
	
	private A(){}
	
	// prima alternativa come campo
	public static A instance = new A();
	
	// seconda alterntiva come metodo
	
	private static A privIntance;
	
	public static A getInstance(){
		// NO, crea ogni volta una A
		//return new A();
		if (privIntance == null){
			privIntance = new A();
		}
		return privIntance;
	}
	
	public int max(int x, int y){
		return x > y ? x : y;
	}
	
	

}
