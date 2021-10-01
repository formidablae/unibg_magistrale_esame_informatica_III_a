package pattern_12_11_19;

class CPU{
	int freq;
}
class RAM{
	double quantity;
}
//senza facade
class ComputerNF{
	private CPU cpu;
	private RAM ram;
	
	CPU getCPU() {return cpu;}
	RAM getRAM() {return ram;}
}
// facade
class ComputerFacade{
	private CPU cpu;
	private RAM ram;
	// facade
	double getRAMquantity() {
		return ram.quantity;
	}
	int CPUfreq() {
		return cpu.freq;
	}
	
}




public class FacadeUso {

}
