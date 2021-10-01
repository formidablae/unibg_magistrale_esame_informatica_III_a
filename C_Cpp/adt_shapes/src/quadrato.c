/*
 * quadrato.c
 *
 *  Created on: 12/ott/2010
 *      Author: garganti
 */

#include "quadrato.h"
#include <stdio.h>
#include <stdlib.h>

struct quadrato{
	int lato;
};

quadratoRef makeQuadrato(int l){
	quadratoRef res = malloc(sizeof(struct quadrato));
	res ->lato = l;
	return res;
}

void printQuad(quadratoRef r){
	printf("quadrato [%d]",r->lato);
}
