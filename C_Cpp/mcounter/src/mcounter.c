/*
 * mcounter.c
 *
 *  Created on: 07/ott/2010
 *      Author: garganti
 */
#include "mcounter.h"

static int count;
// se facessi cos� sarebbe visibile da fuori
//int count;

void reset(void) {
	count = 0;
}
void inc(void) {
	count ++;
}
int getValue(void) {
	return count;
}
