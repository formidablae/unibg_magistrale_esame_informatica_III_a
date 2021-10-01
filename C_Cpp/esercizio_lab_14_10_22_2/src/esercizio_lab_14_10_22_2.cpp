//============================================================================
// Name        : esercizio_lab_14_10_22_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
// dato in ingresso due interi a e b ,
// calcola la somma di tutti gli interi tra a e b.
// passaggio valore e iterativa
int somma(int a, int b) {
	int res = 0;
	for (int i = a; i <= b; i++) {
		res += i;
	}
	// oppure più sintetico
	//for (res = 0; a <= b; a++, res += a);
	return res;
}

// passaggio riferimento e ricorsiva
int sommaR(int& a, int& b) {
	if (a>b) return 0;
	int a1 = a+1;
	return a + sommaR(a1,b);
}

// passaggio riferimento e ricorsiva
int sommaTR(int& a, int& b) {
	if (a>b) return 0;
	int a1 = a+1;
	return a + sommaR(a1,b);
}



int TRE;

int main() {
	TRE = somma(1,2);
	cout << "v1: " << TRE << endl; // prints !!!Hello World!!!
	return 0;
}
