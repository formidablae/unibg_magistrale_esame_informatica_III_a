/*
 ============================================================================
 Name        : adt_shapes.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "quadrato.h"
#include "rettangolo.h"

int main(void) {
	rettangoloRef r = makeRettangolo(3,3);
	quadratoRef q = makeQuadrato(5);
	printRett(r);
	printQuad(q);
	return EXIT_SUCCESS;
}
