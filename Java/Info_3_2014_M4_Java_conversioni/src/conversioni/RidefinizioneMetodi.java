package conversioni;

class A{
	public void f(){}
	public A m(int x){return null;}
}

class B extends A{
	// Ok, identica segnatura
	@Override
	public void f(){}
	// no covrianza delle segnatura
	public A m(int x){return null;}
}
class C extends A{
	// covarianza di m sul tipo ritornato
	@Override
	public C m(int x){return null;}
}
class D extends A{
	// NO covrianza del parametro
	// @Override
	// public A m(short x){return null;}
}
class E extends A{
	@Override
	// Errore non è permessa la controvarianza
	// sul apramtetro
	//public A m(long x){return null;}
}





public class RidefinizioneMetodi {

}
