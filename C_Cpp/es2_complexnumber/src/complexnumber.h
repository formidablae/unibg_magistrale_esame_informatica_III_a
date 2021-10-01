/*
 * complexnumber.h
 *
 *  Created on: 10/dic/2014
 *      Author: garganti
 */

#ifndef COMPLEXNUMBER_H_
#define COMPLEXNUMBER_H_

#include <iostream>

class complex{
    double im;
    double re;
public:
    complex(double,double);
	complex operator+(const complex & )const;
	complex &operator=(const complex & );
	friend std::ostream &operator<<(std::ostream & , const complex  &);
};



#endif /* COMPLEXNUMBER_H_ */
