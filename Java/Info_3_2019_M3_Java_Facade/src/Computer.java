
public class Computer {
	
	public Computer() {
		cpu = new CPU();
	}
	
	// componenti sono privati
	private CPU cpu;
	
	private HardDisk hd;
	
	private Memoria mem;

	// accesso mediante facade
	public void getFrequency() {
		cpu.getFrequency();		
	}
	

}
