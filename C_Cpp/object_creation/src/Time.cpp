/*
 * Time.cpp
 *
 *  Created on: Nov 10, 2009
 *      Author: garganti
 */

#include <iostream>

#include "Time.h"

using namespace std;

Time::Time() {
	hour = 0;
	min = 0;
	sec = 0;
}

// Print Time in military format
void Time::printMilitary()
{
   cout << (hour < 10 ? "0" : "") << hour << ":"
	<< (min < 10 ? "0" : "") << min << ":"
	<< (sec < 10 ? "0" : "") << sec << endl;
}
