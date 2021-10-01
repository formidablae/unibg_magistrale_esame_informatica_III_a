//============================================================================
// Name        : uso_distuttore.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include <iostream>
#include "Studente.h"
using namespace std;

void f0(){
	cout << "entro f0 " << endl;
	Studente s2;
}

void ffff(int x, int = 0);


void f1(){
	cout << "entro f1 " << endl;
	Studente *s = new Studente;
	//...
	delete s; s = NULL;
	delete s;
}

int main() {

	f0();
	cout << "fine f0 " << endl;
	return 0;
}

