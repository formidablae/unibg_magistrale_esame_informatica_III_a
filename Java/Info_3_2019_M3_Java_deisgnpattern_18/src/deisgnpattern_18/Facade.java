package deisgnpattern_18;

class CPU{
	float frequency() {return 1000;}
}
class SSD{
	float capacity() {return 1000;}
}

class Computer{
	private CPU cpu;
	private SSD ssd;
	// ...
	// facade
	float frequency() {return cpu.frequency();}
	float capacity() {return ssd.capacity();}
}
public class Facade {
	public static void main(String[] args) {
		Computer miopc = new Computer();
		// modo classico
		//System.out.println(miopc.cpu.frequency());
		//System.out.println(miopc.ssd.capacity());
		System.out.println(miopc.frequency());
		System.out.println(miopc.capacity());
	}
	
}
