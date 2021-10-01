/*
 * D.h
 *
 *  Created on: Nov 17, 2009
 *      Author: garganti
 */

#ifndef D_H_
#define D_H_
#include "B2.h"
#include "B3.h"

class D: public B2, public B3{
public:
	D();
	virtual ~D();
	void printI();
};

#endif /* D_H_ */
