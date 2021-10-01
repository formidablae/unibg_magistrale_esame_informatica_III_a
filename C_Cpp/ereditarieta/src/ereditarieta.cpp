//============================================================================
// Name        : ereditarieta.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Persona{
public:
	Persona(string& s){}
};

class Studente : Persona{

public:
	Studente(string & n, string& uni): Persona(n){
		//:....
	}
};


class A {
private:
	int pr();
public:
	int pu(){return 0;};
};

class BPU : public A{
private:
	int j;
	void foo(){
		pu();
	}
};

class BPR : protected A{

private:
	void foo2(){ pu();}
public:
	static A copy(BPR bpr){
		A a1 = bpr;
		return a1;
	}
};


int main() {
	BPU b1;
	b1.pu();
	// uso di un metodo pubblico diventato privato non è permesso
	BPR b2;
	//b2.pu(); // errore


	// non è sottotipo
	A a2 = b1; // non molto elegante (cast ad A)
	A *pA1 = &b1;
	pA1-> pu();
	//A *pA2 = &b2; // ERRORE
	A a3 = BPR::copy(b2); // non molto elegante (cast ad A)


	return 0;
}
