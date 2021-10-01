package designpattern;

class CPU{
	float getFreq(){ return 100;}
	void overclock(int factor){}
}

class RAM{}

class DISK{}

class PC{
	CPU cpu;
	RAM ram;
	DISK disk;
	// facade
	float getFreq(){return cpu.getFreq();}
}

public class Facade {

}
