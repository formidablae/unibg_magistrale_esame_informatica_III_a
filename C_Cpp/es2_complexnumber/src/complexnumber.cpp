/*
 * complexnumber.cpp
 *
 *  Created on: 10/dic/2014
 *      Author: garganti
 */
#include "complexnumber.h"

complex::complex(double i, double r):im(i),re(r){}


complex complex::operator+(const complex & c2)const{
	return complex(this->re+c2.re,this->im+c2.im);
}

std::ostream &operator<<(std::ostream & o, const complex  & c){
	return o << c.re << " " << c.im;
}

