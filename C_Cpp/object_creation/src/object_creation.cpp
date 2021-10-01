//============================================================================
// Name        : object_creation.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Time.h"

using namespace std;

int main() {

	Time t1;
	Time *t;
	t = new Time;
	cout << "creato oggetto" << endl;
	// an array of
	Time arrayOfTimes[5];
	int n;
	cin >> n;
	Time arrayOfTimesN[n];
	cout << "sizeof Time " << sizeof(Time) << endl;
	cout << "sizeof array " << sizeof arrayOfTimesN << endl;
	arrayOfTimesN[0].printMilitary();

	// array dinamico
	Time *dynArrayOfTimesN;
	dynArrayOfTimesN = new Time[n];
	cout << "dynamic array sizeof " << sizeof dynArrayOfTimesN << endl;
	dynArrayOfTimesN[0].printMilitary();


}
