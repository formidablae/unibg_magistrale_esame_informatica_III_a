//============================================================================
// Name        : static_internal.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class A{
public:
	static void bar(){}
	inline static int g(){
		return g() + 1;
	}
};

void f(void){
	A::g();
	int x = 0;
	x++;
	static int y = 0;
	y++;
	cout << "valore di x " << x << endl;
	cout << "valore di y " << y << endl;
}


int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	f();
	f();
	f();
	//
	A::bar();

	return 0;
}
