/*
 ============================================================================
 Name        : esercizio1_encapsulation.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

#include "module/mcomputer.h"

int main(void) {
	// using module
	setComputerData("pippo",0);
	printComputer(0);

	return EXIT_SUCCESS;
}
