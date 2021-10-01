/*
 * auto.h
 *
 *  Created on: 22-ott-2008
 *      Author: garganti
 */

#ifndef AUTO_H_
#define AUTO_H_

#define MAX_VEL 150

typedef int automobile;

//typedef struct{int vel; char[20] name;} autos;

void ferma(automobile* a);

void accelera(automobile* a);

void decelera(automobile* a);

int getVel(automobile a);

#endif /* AUTO_H_ */
