package varargs;

import java.util.logging.Handler;

public class UseVarargs {
	
	static void print(String ...s) {
		// s -> di tipo String[]
		for(String a: s) System.out.print(a + "   ");
		System.out.println();
	}
	// mix varargs non varagrs
	static void foo(int a, Handler ...handlers) {}
	// cose che non si possono
	static void foo(Handler ...handlers1,Handler ...handlers2) {}
	static void foo(Handler ...handlers,int a) {}
	// 1 solo varargs e come ultimo argomento 
	
	public static void main(String[] args) {
		print("ciao");
		print("ciao", "IO", "amo", "java");
		String s ="oggi";
		print("dove", "sei", s);
	}
}
