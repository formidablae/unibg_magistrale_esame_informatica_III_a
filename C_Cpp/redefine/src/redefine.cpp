//============================================================================
// Name        : redefine.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include <iostream>
class A {
	int i;
public:
	A() :
			i(1) {
	}
	;
	int f() {
		return i;
	}
};
class B: public A {
	int i;
public:
	B() :
			i(2) {
	}
	;
	void f(int s) {
		i = s;
	} //REDEFINING
	int g() {
		return f(); //ERROR
		//return A::f(); //OK
	}
};

int main() {
	B b;
	cout << b.g() << endl;
	return 0;
}
