/*
 ============================================================================
 Name        : adt_counter.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include "adt_counter.h"

int main(void) {

	counterRef c;
	c = make_counter();
	printf("value %d", getValue(c));
	inc(c);
	printf("value %d", getValue(c));

}
