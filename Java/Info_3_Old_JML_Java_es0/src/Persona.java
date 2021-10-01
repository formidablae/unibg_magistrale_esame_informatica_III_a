public class Persona {
	public float altezza, peso;

	public float getAltezza() {
		return altezza;
	}
	//@ requires a > 0;
	//@ ensures altezza == a;
	public void setAltezza(float a) {
		this.altezza = a;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getIndiceDiMassa(){
		float indice = peso /((altezza/100) * (altezza/100) );
		return indice;
	}

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setAltezza(170);
		p.setPeso(70);
		System.out.println(p.getIndiceDiMassa());
	}

}
