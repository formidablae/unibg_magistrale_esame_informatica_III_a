/*
 * auto.c
 *
 *  Created on: 22-ott-2008
 *      Author: garganti
 */
#include "auto.h"

void ferma(automobile* a) {
	(*a) = 0;
}

void accelera(automobile* a) {
	if ((*a) < MAX_VEL)
		(*a) += 10;
}

void decelera(automobile* a) {
	(*a) -= 10;

}

int getVel(automobile a) {
	return (int) a;
}

