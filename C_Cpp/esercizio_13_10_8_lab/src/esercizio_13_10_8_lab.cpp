//============================================================================
// Name        : esercizio_13_10_8_lab.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int somma_I(int* a, int* b){
	int sum = 0;
	for(int i = *a; i <= *b; i ++)
		sum += i;
	return (sum);
}

int somma_R(int a, int b){
	if (a==b) return (a);
	else return (a +somma_R(a+1,b));
}
// a e b sono gli estremi
// sum è la somma parziale
int somma_TR(int& a, int& b, int sum){
	if (a>b) return sum;
	a = a+1;
	sum += a;
	return somma_TR(a,b,sum);
}

int TRE;

int main() {
	// valore e ricorsiva
	TRE = somma_R(1,2);
	// puntatore e iterativa
	int x = 1, y = 2;
	TRE = somma_I(&x,&y);
	// riferimento e tail recursion
	TRE = somma_TR(x,y,0);
	cout << "attenzione x e y SONO CAMBIATE"
			<< x << ", "<< y << endl;
	// output di prova
	cout << somma_R(5,6)<< endl; // prints !!!Hello World!!!
	cout << somma_I(&x,&y)<< endl; // prints !!!Hello World!!!
	cout << somma_TR(x,y,0)<< endl; // prints !!!Hello World!!!
	return 0;
}
