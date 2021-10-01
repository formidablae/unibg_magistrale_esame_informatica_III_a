/*
 ============================================================================
 Name        : pass_punt_punt2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int y = 10;

void sty(int* p) {
	p = &y;
}
void sty2(int** p) {
	*p = &y;
}

int main(void) {
	int m = 0;
	int * q = &m;
	sty(q);
	printf("%d", *q);
	return EXIT_SUCCESS;
}
