/*
 ============================================================================
 Name        : adt_counter.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include "adt_counter.h"
#include <stdlib.h>

struct counter { /* counter is implemented as */
	unsigned long value; /*  value */
};

/* Create new counter instance, initially null. */
counterRef make_counter(void){
	counterRef result = malloc(sizeof(struct counter));
	result->value = 0;
	return result;
}


/** increments the counter by 1*/
void inc(counterRef r){
	r->value ++;
}


/** return counter value */
int getValue(counterRef c){
	return c->value;
}
