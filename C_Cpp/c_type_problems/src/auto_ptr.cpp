/*  differenza tra variabili sullo stack
 * e nello heap in C++
 */

class P{}

void foo(){
	P* p = new P; // variabile nello heap
	// contiuna a valere anche dopo la fine di foo.
	P a; // variabile sullo stack

}
