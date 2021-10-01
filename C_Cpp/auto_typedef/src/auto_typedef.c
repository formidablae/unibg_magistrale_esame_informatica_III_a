/*
 ============================================================================
 Name        : auto_typedef.c
 Author      : AG
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

#include "auto.h"

int main(void) {
	// creiamo un'auto
	automobile c1;
	// fermiamo
	ferma(&c1);
	// acceleriamo
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);
	accelera(&c1);

	c1 = 300;

	// stampiamo la velocità
	printf("la c1 va a %d\n", getVel(c1));
	// rallentiamo
	decelera(&c1);
	// stampiamo la velocità
	printf("la c1 va a %d\n", getVel(c1));

}
