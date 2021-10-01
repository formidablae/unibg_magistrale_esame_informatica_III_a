/*
 ============================================================================
 Name        : GARGANTINI_ANGELO_PP.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void del1Int(int** p) {
	(*p)++;
}

int main(void) {
	int a[] = { 1, 2, 3 };
	printf("%d%d%d\n", a[0], a[1], a[2]);
	int* p = a;
	printf("%d\n", p[0]);
	// sposto p
	del1Int(&p);
	// mi aspetto che a sia invariato
	printf("%d%d%d\n", a[0], a[1], a[2]);
	// mia spetto che p[0] sia ora 2;
	printf("%d\n", p[0]);
	return EXIT_SUCCESS;
}
