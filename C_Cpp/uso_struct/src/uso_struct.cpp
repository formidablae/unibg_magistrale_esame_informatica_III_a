//============================================================================
// Name        : uso_struct.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

struct Time{
	int hour;
};

void printMilitary(Time &t){
	cout << "hour: " << t.hour << endl;
}

int main() {
	Time t;
	printMilitary(t);
	t.hour = 200;
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	return 0;
}
