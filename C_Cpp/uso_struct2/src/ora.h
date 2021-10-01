/*
 * ora.h
 *
 *  Created on: 24/ott/2012
 *      Author: garganti
 */

#ifndef ORA_H_
#define ORA_H_

struct Ora{
	int ora;
	int min;
	int sec;
};

void printMilitary(struct Ora * o);
void printStandard(struct Ora * o);



#endif /* ORA_H_ */
