/*
 * mcomputer.c
 *
 *  Created on: 12/nov/2014
 *      Author: garganti
 */

#include "mcomputer.h"
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
#define N_COMPUTER 10

// data about computers
// names: N_COMPUTER strings
static char* names[N_COMPUTER];

void setComputerData(char* n,int c){
	if (names[c]==NULL){

		names[c] = malloc(sizeof(char)*(strlen(n)+1));
		strcpy(names[c],n);
	}
}

void printComputer(int c){
	printf("computer %d %s", c, names[c]);
}


