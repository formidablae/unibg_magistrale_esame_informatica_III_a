//============================================================================
// Name        : diamond.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class L{
public:
	int common;
};
class B1: public L{};
class B2: public L{};

class C: public B1,B2 {int common;};

int main() {
	C c;
	cout << c.B1::common << endl;
	return 0;
}
