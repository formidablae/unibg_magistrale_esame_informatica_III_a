/*
 * ora.c
 *
 *  Created on: 24/ott/2012
 *      Author: garganti
 */
#include "ora.h"
#include <stdio.h>

void printMilitary(struct Ora * o){
	printf("ora %d %d %d",
			o->ora, o-> min, o->sec);
}
void printStandard(struct Ora * o);

