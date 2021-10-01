/*
 ============================================================================
 Name        : esercizio_13_10_8_lab_complex.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "complex.h"

int main(void) {
	complex o = {0,0};
	print(o);
	complex uno = {1,1};
	complex s = sum(o,uno);
	print(s);
	return EXIT_SUCCESS;
}
