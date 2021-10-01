//============================================================================
// Name        : ered_sotto.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

using namespace std;

class A {
public:
	virtual void m() {
		cout << "m";
	}
	void f() {
		cout << "f";
	}
};

class B: private A {
private:
	void m() {
		cout << "m";
	}
};

int main() {
	A* a = new B;
	a->m();
	return 1;
}

