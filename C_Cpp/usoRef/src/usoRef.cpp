//============================================================================
// Name        : usoRef.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int y = 0;
	cout << y << endl;

	int& u = y;

	u = 10;
	int a = 9;
	u = a;

	cout << y << endl;

	return 0;
}
