//============================================================================
// Name        : esercizio_nov12_stl5.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "rubrica.h"
using namespace std;


int main() {
	rubrica r;
	string* n1 = new string("angelo");
	string* tel1 = new string("03455555");
	r.inserisci(n1,tel1);
	cout << *(r.find(n1)) << endl;
	return 0;
}
