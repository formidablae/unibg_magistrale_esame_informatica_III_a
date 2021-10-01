//============================================================================
// Name        : copyConstructor.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class A1{
public:
	int i;
	int* pi;
	A1(){ i = 5; pi = new int; *pi = 10;}
	A1(const A1& a){ i = a.i; pi = new int; *pi = *(a.pi);}
};

int maindsdsd() {
	A1 a1;
	A1 a2 = A1(a1);
	cout << "value of i of a1 "<< a1.i << " value of pointed i of a1 "<< *(a1.pi) <<endl;
	cout << "value of i of a2 "<< a2.i << " value of pointed i of a2 "<< *(a2.pi) <<endl;
	//
	a1.i++;
	*(a1.pi)= 20;
	cout << "value of i of a1 "<< a1.i << " value of pointed i of a1 "<< *(a1.pi) <<endl;
	cout << "value of i of a2 "<< a2.i << " value of pointed i of a2 "<< *(a2.pi) <<endl;
	return 0;
}
