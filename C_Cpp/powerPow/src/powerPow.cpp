//============================================================================
// Name        : powerPow.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

// return x^y
long int power(int& x, int& y){
	long int res = 1;
	while(y > 0){
		res *= x;
		y --;
	}
	return res;
}


int main() {
	//cout << power(2,3) << endl; // prints !!!Hello World!!!
	int a = 2, b = 3;
	cout << power(a,b)<< endl;
	cout << "a" << a << " b" <<b << endl;
	int z = 4;
	//power(4,4)
	cout << power(z,z)<< endl;
	return 0;
}
