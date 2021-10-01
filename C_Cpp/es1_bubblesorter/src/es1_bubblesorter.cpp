//============================================================================
// Name        : es1_bubblesorter.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "bubblesorter.h"

using namespace std;
/* 1. Bubble sorter
 Scrivi una classe BubbleSorter che ordina un array di interi.
 BubbleSorter ha un costruttore che prende un array di interi tramite puntatore (int*) - e se serve la dimensione dell'array.
 Ha un metodo sort che quando chiamato ordina l'array (nota: se non è stato già ordinato) senza però modificare l'array originale (deve quandi fare una copia).
 Ha un metodo getArrayOrdinato che restituisce l'array ordinato.
 Separa il .h e il .cpp di BubbleSorter e scrivi un file di prova con qualche array.
 */
void print(const int* a, int n) {
	for (int i = 0; i < n; i++)
		cout << a[i] << " ";
	cout << endl;
}

int main() {
	int array[] = { 3, 4, 5 };
	int l = sizeof(array) / sizeof(int);
	BubbleSorter s(array, l);
	print(s.getArrayOrdinato(), l);
	s.sort();
	print(s.getArrayOrdinato(), l);
	return 0;
}

