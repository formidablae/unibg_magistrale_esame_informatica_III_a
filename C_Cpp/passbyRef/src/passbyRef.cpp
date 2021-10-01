//============================================================================
// Name        : passbyRef.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
#include <iostream>
using namespace std;

class BigClass{
public:
	int data[20];
};
void m(const BigClass& c){ cout << c.data[0];}

int main() {
	BigClass b;
	b.data[0] = 100;
	cout << b.data[0]<< endl;
	m(b);
	cout << b.data[0]<< endl;
	return 0;
}
