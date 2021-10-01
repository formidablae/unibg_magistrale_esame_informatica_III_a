//============================================================================
// Name        : swap.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void swap(int& x, int& y){
	int temp = x;
	x = y;
	y = temp;
}

int main() {
	int a = 6,b = 10;
	swap(a,b);
	cout << a << " " << b << endl; // prints !!!Hello World!!!
	return 0;
}
