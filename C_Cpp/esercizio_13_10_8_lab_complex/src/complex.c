/*
 * complex.c
 *
 *  Created on: 08/ott/2013
 *      Author: garganti
 */

#include "complex.h"
#include <stdio.h>

void print(complex v){
	printf("%f,%f\n",v.re, v.im);
}

complex sum(complex a, complex b){
	complex result;
	result.re = a.re + b.re;
	result.im = a.im + b.im;
	return result;
}

