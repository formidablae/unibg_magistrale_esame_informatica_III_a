/*
 ============================================================================
 Name        : uso_struct2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

#include "ora.h"

int main(void) {
	struct Ora adesso;
	adesso.min = 3000;
	// ...
	printMilitary(&adesso);
	return EXIT_SUCCESS;
}
