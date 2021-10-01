/*
 ============================================================================
 Name        : adt_automobili.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "automobili.h"

int main(void) {
	Automobile c1 = mkAuto();
	stop(c1);
	accelera(c1);
	printf("%d", getVel(c1));
	delAuto(c1);
	return EXIT_SUCCESS;
}
