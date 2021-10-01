/*
 * automobili.h
 *
 *  Created on: Oct 3, 2012
 *      Author: garganti
 */

#ifndef AUTOMOBILI_H_
#define AUTOMOBILI_H_

typedef struct AutoStruct * Automobile;

Automobile mkAuto();

void delAuto(Automobile);

void accelera(Automobile);

int getVel(Automobile);

void stop(Automobile);




#endif /* AUTOMOBILI_H_ */
