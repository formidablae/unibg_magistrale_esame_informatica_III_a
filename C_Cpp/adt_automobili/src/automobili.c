/*
 * automobili.c
 *
 *  Created on: Oct 3, 2012
 *      Author: garganti
 */

#include "automobili.h"
#include "stdlib.h"

struct AutoStruct{
	char* color;
	int vel;
};

Automobile mkAuto(){
	return malloc(sizeof(struct AutoStruct));
}

void delAuto(Automobile a){
	free(a);
}


void accelera(Automobile a){
	a->vel +=10;
}

int getVel(Automobile a){
	return a->vel;
}

void stop(Automobile a){
	a->vel = 0;
}


