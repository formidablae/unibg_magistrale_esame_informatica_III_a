/*
 ============================================================================
 Name        : esempi_type_violation.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	// 1. type cast non controllato
	double y = -3895778934578934.34889789;
	double* d = &y;
	int* i;
	i = d;
	*i = *i + 1;
	printf("%d\n",*i);

	// 2. NULL
	int *p = NULL;
	// mi dimentico che p è nullo
	//*p = 0;

	// 3. memory violation
	int a[10];
	int* p2 = a;
	p2 = p2+10;
	*p2 = 40;
	printf("%d\n",*p2);
	printf("%d\n",a[10]);

	// dangling pointer per il free
	int * p3 = malloc(sizeof(int));
	*p3 = 100;
	printf("%d\n",*p3);
	free(p3);
	// p3 puntatore dangling
	printf("%d\n",*p3);

	return EXIT_SUCCESS;
}
