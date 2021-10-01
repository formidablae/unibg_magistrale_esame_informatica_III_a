//============================================================================
// Name        : uso_distruttore2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class A{
	char name;
public:
	A(char n ): name(n){}
	~A(){
		cout << " chiamato distruttore " << name << endl;
	}
	void m(void) const{
		//name = 'Z';
	}
	void f(const int h){
		//h = 0;
	}
	void g(const A& a){
		a.name = '5';
	}
};

void f(){
	A f('f');
} //chiamato distruttor

A* g(){
	A* g = new A('g');
	return g;
}


int main() {
	cout << "chiamo f" << endl;
	f();
	cout << "fine f" << endl;
	cout << "chiamo g" << endl;
	A* res =g();
	cout << "fine g" << endl;
	delete res;
	res=NULL;
	cout << "fine main" << endl;
	return 0;
}
