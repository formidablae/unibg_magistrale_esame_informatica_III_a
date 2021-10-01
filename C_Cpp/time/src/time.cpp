//============================================================================
// Name        : time.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

#include "ora.h"

int main() {
	Ora adesso;
	Ora inizi[24];
	Ora * pOra;
	//Ora & refOra;
	// diverse invocazioni del costruttore
	Ora mezzogiorno(12);
	Ora mezzanotte = 24;
	Ora tre = Ora(3);


	int * pi = new int;

	adesso.setMin(3000);
	adesso.printMilitary();

	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	return 0;
}
