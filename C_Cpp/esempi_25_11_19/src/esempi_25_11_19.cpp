//============================================================================
// Name        : esempi_25_11_19.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Base {
	public:
	Base(int x){cout << "costruisco Base " << x <<endl;}
	virtual ~Base(){cout << "distruggo Base " <<endl;}
	void m(){cout << "metodo m" << endl;}
};
class DerivataPub: public Base{
	public:
	DerivataPub(): Base(4){cout << "costruisco DerivataPub" << endl;}
	~DerivataPub(){cout << "distruggo DerivataPub " <<endl;}
};
class DerivataPri: private Base{
	public:
	DerivataPri(): Base(4){cout << "costruisco DerivataPri" << endl;}
	Base::m;
};

int mainnn() {
	Base* pdpu = new DerivataPub;
	//dpu->m();
	// NON POSSO DerivataPri non è sottotipo di Base
	// Base* pdpr = new DerivataPri;
	//dpr.m();
	return 0;
}
