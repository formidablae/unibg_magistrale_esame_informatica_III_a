/*
 * Auto.cpp
 *
 *  Created on: 19/ott/2010
 *      Author: garganti
 */

#include "Auto.h"

Auto::Auto() :
	speed(0), targa("ild"), eta(7), sorella() {
	// invece che
	//	speed = 0;
	//	targa = "uuii";
	//	eta = 1;
}

Auto::~Auto() {
	// TODO Auto-generated destructor stub
}
