/*
 ============================================================================
 Name        : provaCrash.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int J;

int main(void) {
	int x;
	int* pint;
	pint = &x;
	*pint = 0;
	// blocco inline
	if(x ==0){
		int u;
		u = 0;
	}
	return EXIT_SUCCESS;
}
int f(){
	x = 0;
}
