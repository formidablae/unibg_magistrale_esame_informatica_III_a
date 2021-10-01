//============================================================================
// Name        : prodotto.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;


int prodotto(int& x, int& y) {
	int ris = 0;
	while (y > 0) {
		int u = 0;
		ris += x;
		y--;
	}
	return ris;
}

int prodottoP(int* x, int* y) {
	int ris = 0;
	while (*y > 0) {
		int u = 0;
		ris += *x;
		(*y)--;
	}
	return ris;
}


int main() {
	int a = 4;
	int b = 5;
	// prodotto ok
	int r = prodotto(a, b);
	// ouptup ì attento è modificata b
	cout << a << "*" << b << "=" << r << endl;
	//
	r = prodotto(a, a);
	cout << a << "*" << a << "=" << r << endl;
	// puntatori
	r = prodottoP(&a, &b);
	cout << a << "*" << a << "=" << r << endl;
}
