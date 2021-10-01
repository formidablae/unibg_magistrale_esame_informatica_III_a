/*
 * ora.cpp
 *
 *  Created on: 24/ott/2012
 *      Author: garganti
 */

#include "ora.h"

Ora::Ora(){}

Ora::Ora(int h):min(0){ora = h; sec = 0;}

void Ora::setMin(int m){
	min = m;
}

void Ora::printMilitary(){}
