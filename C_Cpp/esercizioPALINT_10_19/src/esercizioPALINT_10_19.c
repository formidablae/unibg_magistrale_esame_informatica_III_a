/*
 Scrivi una funzione PALINT che dato in ingresso
 un array di numeri interi restituisce (usa stdbool.h)
 se l’array è palindromo (cioè se si legge l’array dalla
 prima all’ultima posizione o viceversa, si ha sempre la stessa sequenza di numeri).
 Scrivi tre versioni:
 una ITERATIVA,
 una ricorsiva SENZA TAIL
 una ricorsiva con TAIL recursion.

 Scrivi anche un main di esempio in cui chiami la
 funzione con un paio di array a tua scelta. */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// versione iterativa
// a: array di n interi
bool PALINT_i(int a[], int n){
	for(int i=0; i < n/2; i++){
		if (a[i] != a[n-i-1]) return false;
	}
	return true;
}
// versione ricorsiva
bool PALINT_r(int a[], int n){
	if (n <= 1) return true;
	// è palindromo se testa ) coda e
	// l'array tolta la testa e la coda è ancora palindromo
	return a[0] == a[n-1] && PALINT_r(a+1, n-2);
}

// versione ricorsiva tail
// i: elemento da considerare
bool PALINT_trh(int a[], int n, int i){
	if (i > n/2) return true;
	//
	if (a[i] != a[n-i-1]) return false;
	else return PALINT_trh(a, n, i+1);
}
bool PALINT_tr(int a[], int n){
	return PALINT_trh(a, n, 0);

}


int main(void) {
	int p1[] = {1,2,3,2,1};
	printf("%d ",PALINT_i(p1, 5));
	printf("%d ",PALINT_r(p1, 5));
	printf("%d\n",PALINT_tr(p1, 5));
	int p2[] = {1,2,3,4,1};
	printf("%d ",PALINT_i(p2, 5));
	printf("%d ",PALINT_r(p2, 5));
	printf("%d\n",PALINT_tr(p2, 5));
	return EXIT_SUCCESS;
}
