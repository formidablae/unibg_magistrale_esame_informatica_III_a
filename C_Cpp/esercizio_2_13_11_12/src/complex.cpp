/*
 * complex.cpp
 *
 *  Created on: 12/nov/2013
 *      Author: garganti
 */

#include "complex.h"
using namespace std;

complex::complex(double re, double im) {
	this->re = re;
	this->im = im;
}

complex::~complex() {
	// TODO Auto-generated destructor stub
}

complex complex::operator +(complex &c) {
	return complex(this->re + c.re,
			this->im + c.im);
}

std::ostream &operator<<(std::ostream & out, const complex &c) {
	return out << c.re << "+" << c.im << "i";
}

istream &operator>>( istream & in, complex & c){
	return (in >> c.re >> c.im);
}


