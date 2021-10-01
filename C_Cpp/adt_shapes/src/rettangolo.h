/*
 * rettangoli.h
 *
 *  Created on: 12/ott/2010
 *      Author: garganti
 */

#ifndef RETTANGOLI_H_
#define RETTANGOLI_H_

typedef struct rettangolo * rettangoloRef;

rettangoloRef makeRettangolo(int b,int h);

void printRett(rettangoloRef r);

#endif /* RETTANGOLI_H_ */
