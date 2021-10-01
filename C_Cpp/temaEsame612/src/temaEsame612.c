/*
 ============================================================================
 Name        : temaEsame612.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

//
int countLENR(int *array, int n, int x) {
	int count = 0;
//	int i;
//	for(i = 0; i < n; i++,array++){
	int * p = array;
	for (; (p - array) < n; p++) {
//		if ( *(array +i) <= x) count ++;
		//if ( array[i] <= x) count ++;
		if (*p <= x)
			count++;
	}
	return count;
}
int countLER(int * array, int n, int x) {
	int m;
	if (n==0) return 0;
	m = countLER(array +1, n-1, x);
	if (*array <= x) return m+1;
	else return m;
}
// count come risultato intermedio
// inizialmente uguale 0
int countLETR(int * array, int n, int x, int count) {
	if (n== 0) return count;
	if (*array <= x)
		// aggiungi l'elemento corrente al conteggio
		return countLETR(array +1, n-1, x, count +1);
	else
		// non contare l'elemento corrente
		return countLETR(array +1, n-1, x, count);
}

int main(void) {
	int m;
	int a[] = { 1, 2, 3 };
	m = countLENR(a, 3, 2);
	printf("%d\n", m);
	m = countLER(a, 3, 2);
	printf("%d\n", m);
	m = countLETR(a, 3, 2,0);
	printf("%d\n", m);
	return EXIT_SUCCESS;
}
