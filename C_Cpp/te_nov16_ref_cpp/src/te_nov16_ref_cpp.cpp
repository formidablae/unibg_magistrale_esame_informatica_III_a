//============================================================================
// Name        : te_nov16_ref_cpp.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int delta_r(int& x, int &y){
	// delta
	// assumo x > y > 0
	while(y>0){x --; y --;}
	return x;
}

int main() {
	int x = 10;
	int y = 7;
	cout << "delta "<< delta_r(x,y) << endl;
	cout << "x:"<< x << " y:"<<  y <<endl;
	// provo a chiamare delta con la stessa variabile
	int a = 10;
	// OK: calcola 0 in modo corretto
	cout << "delta "<< delta_r(a,a) << endl;
	int b = 11;
	// se faccio un numero dispari, delta(b,b) non funziona più
	cout << "delta "<< delta_r(b,b) << endl;


	return 0;
}
