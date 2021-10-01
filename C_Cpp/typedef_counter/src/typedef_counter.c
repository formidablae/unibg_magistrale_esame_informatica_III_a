/*
 ============================================================================
 Name        : typedef_counter.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include "counter.h"
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int v1, v2;
	contatore c1, c2;
	c1 = 0;
	reset(&c1);
	reset(&c2);
	inc(&c1);
	inc(&c1);
	inc(&c2);
	v1 = getValue(c1);
	v2 = getValue(c2);
	return EXIT_SUCCESS;
}
