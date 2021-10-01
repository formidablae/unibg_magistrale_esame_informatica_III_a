/*
 ============================================================================
 Name        : adt_string_c.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "adt_string.h"

int main(void) {
	string s1;
	s1 = mkString("pippo");

	printf(" il mio nome è %s\n", asChars(s1));

	return EXIT_SUCCESS;
}
