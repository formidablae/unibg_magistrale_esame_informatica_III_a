/*
 * esempio.c
 *
 *  Created on: 07/ott/2010
 *      Author: garganti
 */

#include <stdio.h>
#include "mcounter.h"


// se non foose dichiarato static potrei vederlo così:
// extern int count;

int main(int argc, char **argv) {
	reset();
	inc();
	inc();
	//count = 10;
	printf("contatore %d", getValue());
}
