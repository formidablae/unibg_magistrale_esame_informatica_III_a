//============================================================================
// Name        : pass_byref_16.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int fvp(int *px){
	*px = *px +1;
	return *px;
}

int fr(int& x) { // by value
	x = x + 1;
	return x;
}
int f(int x) { // by value
	x = x + 1;
	return x;
}
int main() {
	int y = 0;
	cout << f(y) << " " << y << endl;
	//int &h = y;
	//cout << fr(h);
	cout << fr(y);
	//cout << " " << h;
	cout << " "<<  y << endl;
	cout << fvp(&y);
	cout << " " << y << endl;
	return 0;
}
