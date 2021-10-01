//============================================================================
// Name        : esercizio_lab_14_10_22_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <stdlib.h>

using namespace std;

// 1. passaggio per valore e restituzione del valore,
int raddoppia(int x){ return x+x;}
// 2. passaggio con puntatore e restituzione del valore,
int raddoppia2(int* x){return *x+*x;}
// 3. (void) passaggio per riferimento e modifica della variabile passata
void raddoppia3(int& x){x = x+x; return;}
// 4. (void) passaggio per puntatore e modifica della variabile passata
void raddoppia4(int* x){*x = *x+*x; return;}
// e se fosse:
// 5. passaggio per valore e restituzione del puntatore?
int* raddoppia5(int x){
	// usando malloc di C
	//int* result = (int*)malloc(sizeof(int));
	// oppure usando new di C++
	int* result = new int;
	*result = x+x;
	return result;
}

int DOPPIO;

int main() {
	int y = 4;
	DOPPIO = *raddoppia5(y);
	cout << DOPPIO << endl; // prints !!!Hello World!!!
	return 0;
}
