#include <iostream>
using namespace std;
class W{
public:
	virtual void m(){cout << "metodo m di W"<< endl;}
};
class Z: public W{
public:
	virtual void m(){cout << "metodo m di Z"<< endl;}
};
class AAA{
public:
	virtual void f() = 0;
};
int main2() {
	W* pw = new Z; pw ->m(); // sì binding dinamico
	Z z; W  w = z; w.m(); // NO binding dinamico
	//AAA aaa;
}
