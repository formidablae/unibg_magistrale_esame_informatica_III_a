/*
 * counter.c
 *
 *  Created on: Oct 8, 2010
 *      Author: garganti
 */

#include "counter.h"

void reset(contatore* pc) {
	*pc = 0;
}
void inc(contatore* pc) {
	(*pc)++;
}
int getValue(contatore c) {
	return c;
}
