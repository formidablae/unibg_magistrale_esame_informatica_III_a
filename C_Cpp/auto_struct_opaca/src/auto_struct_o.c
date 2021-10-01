/*
 * auto_typedef.c
 *
 *  Created on: 19/ott/2010
 *      Author: garganti
 */

#include "auto_struct_o.h"

#include <stdlib.h>


struct autoopaca{
	int vel;
};

autoRef newAuto(){
	autoRef res =  malloc(sizeof(struct autoopaca));
	res->vel = 0;
	return res;
}

void stopSO(autoRef a){
	a->vel = 0;
}
