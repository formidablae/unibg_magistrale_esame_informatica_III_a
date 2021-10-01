/*
 * rettangolo.c
 *
 *  Created on: 12/ott/2010
 *      Author: garganti
 */
#include "rettangolo.h"
#include <stdlib.h>
#include <stdio.h>

struct rettangolo{
	int base;
	int altezza;
};

rettangoloRef makeRettangolo(int b,int h){
	rettangoloRef res = malloc(sizeof(struct rettangolo));
	res -> base = b;
	res -> altezza = h;
	return res;
}

void printRett(rettangoloRef r){
	printf("rettangolo [%d,%d]",r->base,r->altezza);
}
