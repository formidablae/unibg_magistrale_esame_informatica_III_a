/*
 ============================================================================
 Name        : GARGANTINI_ANGELO_Es1.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int SOMMA;

// restuisce la somma di un array di interi
// a array di interi di cui fare la somma
// n: numero di elementi nell'array
int somma_nr(int a[], int n) {
//int somma_nr(int* a, int n){
	int res = 0;
	int i = 0;
	for (; i < n; i++) {
		//res += *(a + i);
		res += a[i];
	}
	return res;
}
// funzione ricorsvia (non tail)
int somma_re(int a[], int n) {
	if (n == 0)
		return 0;
	else
		return a[0] + somma_re(a + 1, n - 1);
}
// funzione ricorsiva con tail
// a: array
// n: numero di elementi
// sm: somma parziale
int somma_tr(int a[], int n, int sp) {
	if (n == 0)
		return sp;
	else
		return somma_tr(a + 1, n - 1, sp + a[0]);
}



int main(void) {
	int array[] = { 1, 2 };
	SOMMA = somma_nr(array, 2);
	printf("%d\n", SOMMA);
	SOMMA = somma_re(array, 3);
	printf("%d\n", SOMMA);
	SOMMA = somma_tr(array, 2, 0);
	printf("%d\n", SOMMA);
	return EXIT_SUCCESS;
}
