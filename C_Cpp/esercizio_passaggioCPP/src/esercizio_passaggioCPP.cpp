//============================================================================
// Name        : esercizio_passaggioCPP.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class A {
public:
	int x;
	A(){x = 10;}
};

void set_to0V(A a){
	a.x = 0;
}

void set_to0Ref(A& a){
	a.x = 0;
}

void set_to0Ptr(A* pa){
//	(*pa).x = 0;
	pa->x = 0;
}

int main() {
	A a1;
	cout << "prima: " << a1.x  << endl;
	set_to0V(a1);
	cout << "dopo: " << a1.x  << endl;
////
	A a2;
	cout << "prima: " << a2.x  << endl;
	set_to0Ref(a2);
	cout << "dopo: " << a2.x  << endl;
///
	A a3;
	cout << "prima: " << a3.x  << endl;
	set_to0Ptr(&a3);
	cout << "dopo: " << a3.x  << endl;

	return 0;
}
