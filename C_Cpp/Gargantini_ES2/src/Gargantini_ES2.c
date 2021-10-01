/*
 ============================================================================
 Name        : Gargantini_ES2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "MiaStringa.h"

int main(void) {
	MiaStringaRef prova =makeMiaStringa("prima creazione");
	printf("%s\n",toString(prova));
	add(prova,'a');
	printf("%s\n",toString(prova));
	add(prova,'b');
	printf("%s\n",toString(prova));
	return EXIT_SUCCESS;
}
