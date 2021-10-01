/*
 * complex.h
 *
 *  Created on: 08/ott/2013
 *      Author: garganti
 */

#ifndef COMPLEX_H_
#define COMPLEX_H_

typedef struct {
	double re;
	double im;
} complex;

complex sum(complex a, complex b);

complex prod(complex a, complex b);

void print(complex c);

#endif /* COMPLEX_H_ */
