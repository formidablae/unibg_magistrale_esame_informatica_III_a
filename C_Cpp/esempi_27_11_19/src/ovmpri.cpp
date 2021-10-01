#include <iostream>
using namespace std;
class A{
private:
	virtual void m(){cout << "metodo m di A privato"<< endl;}
public:
	void foo(){cout << "foo "<< endl ; m();}
};
class B: public A{
	int x;
private:
	virtual void m(){cout << "metodo m di B privato"<< endl;}
};
class C: private A{};

int mainMMM() {
	A* pa  = new A;
	pa->foo();
	delete pa;
	// con polimorfismo
	A* pab  = new B;
	pab->foo();
	delete pab;
	// not subtyping
	// ERRORE: A* pc = new C;
	// s
	B b;
	A a = b;
}
