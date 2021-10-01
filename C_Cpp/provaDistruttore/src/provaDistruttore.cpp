//============================================================================
// Name        : provaDistruttore.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "studente.h"
using namespace std;

studente* f(){
	cout << "f" << endl;
	studente* s = new studente;
	return s;
}

void booo(const int x){
	//x = 200;
}

void gooo(const studente& s){
	//s.x = 100;
	s.moo();
}


int main() {
	cout << "main inizio" << endl;
	studente *a = f();
	cout << "distruggo explicitamente" << endl;
	delete a; a = 0;
	cout << a->x << endl;
	cout << "main fine" << endl;
	return 0;
}
