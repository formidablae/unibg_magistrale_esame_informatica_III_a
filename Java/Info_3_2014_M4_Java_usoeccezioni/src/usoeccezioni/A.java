package usoeccezioni;

import java.io.IOException;

class A{
	void me1(){
		//...
		throw new E1("boh");
	}
	void mec() throws EC{
		//...
		throw new EC("boh");
	}
}

class EC2 extends EC{

	public EC2(String s) {
		super(s);
	}}

class B extends A{
	@Override
	// NO, non posoo
	//void mec() throws EC, IOException{
	//
	// Sì Ok non lancia eccwe
	//void mec(){
	//
	// anche questo è ok, covarianza dell'ecc
	void mec() throws EC2{
		//...
	}	
}
