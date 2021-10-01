//============================================================================
// Name        : inline.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

#define plusOneDef(i)  i++;

inline void plusOne(int x){
	x++;
}

int main() {
	int a = 10;
	cout << a << endl;
	plusOne(a);
	cout << a << endl;
	int b = 10;
	cout << b << endl;
	plusOneDef(b);
	cout << b << endl;
	return 0;
}
