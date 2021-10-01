/*
 ============================================================================
 Name        : GARGANTINI_ANGELO_RICORSIONE.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

// versione iterativa
// arr : array e length è la dimensione dell'array
int contaPositivi(int *arr, int length) {
	int i, res = 0;
	for (i = 0; i < length; ++i) {
		if (arr[i] > 0)
			res++;
	}
	return res;
}
// versione ricorsiva senza tail
// arr : array e length è la dimensione dell'array
int contaPositiviRec(int *arr, int length) {
	if (length == 0)
		return 0;
	return (arr[0] > 0 ? 1 : 0) + contaPositiviRec(arr + 1, length - 1);
}
// ricorsiva tail
// res come contatore parziale
int contaPositiviTailRecH(int *arr, int length, int res) {
	if (length == 0)
		return res;
	return contaPositiviTailRecH(arr + 1, length - 1,
			(arr[0] > 0 ? 1 : 0) + res);
}
// funzione helper
int contaPositiviTailRec(int *arr, int length) {
	return contaPositiviTailRecH(arr, length, 0);
}

int main(void) {
	int arr[] = { 1, -1 };
	int POS;
	POS = contaPositivi(arr, 2)
	printf("%d\n",POS);
	POS = contaPositiviRec(arr, 2);
	printf("%d\n", POS);
	POS = contaPositiviTailRec(arr, 2, 0);
	printf("%d\n", POS);
	return EXIT_SUCCESS;
}
