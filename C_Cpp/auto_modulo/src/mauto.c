/*
 * mauto.c
 *
 *  Created on: 22-ott-2008
 *      Author: garganti
 */

#include "mauto.h"

static int automobile;


void ferma(){
	automobile = 0;
}

void accelera(){
	if ((automobile) < 100)  (automobile) += 10;
}

void decelera(){
	automobile -= 10;

}

int getVel(){
	return automobile;
}


