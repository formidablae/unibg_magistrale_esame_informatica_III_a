package y13;

class CPU{
	int clock(){return 1000;}
}

class GPU{}

class Memory{}

class PC{
	private CPU cpu;
	GPU gpu;
	Memory memory;
	
	int clock(){return cpu.clock();}
}


public class ProvaFace {

	public static void main(String[] args) {
		PC myPc = new PC();
		// modo che non garatisce information hiding
		//System.out.println(myPc.cpu.clock());
		System.out.println(myPc.clock());
	}
	
}
