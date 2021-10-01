//============================================================================
// Name        : esempi_19.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Time.hpp"
using namespace std;

extern int min_age;
extern int max_age;

int main1() {
	cout << min_age << endl;
	// NO è static cout << max_age << endl;
	Time now;
	now.printStandard();
	// NO è privato now.hour = 4500;

	Time mezzogiorno(12);
	Time cena = 20;
	Time notte = Time(22);
	Time pasti[] = { Time(8), Time(12), Time(20) };

	cout << sizeof(Time) << endl;
	cout << sizeof(pasti) << endl;

	return 0;
}
