/*
 * complex.h
 *
 *  Created on: 12/nov/2013
 *      Author: garganti
 */

#ifndef COMPLEX_H_
#define COMPLEX_H_
#include <iostream>
using namespace std;

class complex {
	double re,im;
public:
	complex(double r = 0, double i = 0);
	virtual ~complex();
	complex operator +(complex &);
	friend std::ostream &operator<<( std::ostream & , const complex  &);
	friend istream &operator>>( istream &, complex & );
};

#endif /* COMPLEX_H_ */
