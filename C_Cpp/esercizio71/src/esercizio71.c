/*
 ============================================================================
 Name        : esercizio71.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int num, abs;
	printf("inserisci valore");
	scanf("%d", &num);
	if (num <= 0) {
		int abs = -num;
	} else {
		int abs = num;
	}
	{
		int abs;
		printf("valore assoluto è %d", abs);
	}
	return EXIT_SUCCESS;
}
