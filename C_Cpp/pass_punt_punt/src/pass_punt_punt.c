/*
 * Puntatori a puntatori in C
  */

#include <stdio.h>
#include <stdlib.h>

void f1(int** q) {
	*q = *q + 1;
	return;
}

int main(void) {
	puts("Prova pass punt a puntatore"); /* prints !!!Hello World!!! */
	int y[5] = { 0, 1, 2, 3, 4 };
	int * p = y;
	printf("p[0] %d  y[0] %d \n", p[0], y[0]);
	f1(&p);
	printf("p[0] %d  y[0] %d \n", p[0], y[0]);
	return EXIT_SUCCESS;
}

