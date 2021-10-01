/*
 * Time.cpp
 *
 *  Created on: 20 nov 2019
 *      Author: garganti
 */

#include "Time.hpp"
#include <iostream>
using namespace std;


Time::Time(){
	hour = minute = second = 0;
}
/*Time::Time(int h){// costruttore per ora
	hour = h;
	minute = second = 0;
}*/
// con initilizer list
Time::Time(int h, int m, int s): hour(h), minute(m), second(s){}

Time::Time(int h): Time(h,0,0){}

void Time::printStandard() const{
	cout<< hour << ":" << minute << ":" << second <<endl;
}

