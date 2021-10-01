//============================================================================
// Name        : es2_complexnumber.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "complexnumber.h"

using namespace std;

int main() {
	complex c1(0,3);
	complex c2(1,2);
	complex c3 = c1+c2;
	cout << c3 << endl; // prints !!!Hello World!!!
	return 0;
}
