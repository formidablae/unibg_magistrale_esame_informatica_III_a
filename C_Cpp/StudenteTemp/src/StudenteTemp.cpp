//============================================================================
// Name        : StudenteTemp.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Studente.h"

using namespace std;

static int constmag = 100;

void prova(){
	cout << "entro" << endl;
	Studente s;
	cout << "esco" << endl;
}

int main() {
	//prova();
	Studente s;
	Studente s2("pippo");
	Studente s3 = "pippo";
	Studente s4 = Studente("ppp");
	s.print();
	s2.print();

	//Studente classe[10];
	// puntatori
	Studente * pSTud = new Studente("rrrr");
	cout << s.getMatricola() << endl; // prints !!!Hello World!!!
	cout << pSTud->getMatricola() << endl; // prints !!!Hello World!!!
	delete pSTud;
	return 0;
}
