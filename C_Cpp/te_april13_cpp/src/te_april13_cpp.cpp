//============================================================================
// Name        : te_april13_cpp.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class veicolo {
private:
	int pri() {
		return 1;
	}
public:
	int pub() {
		return 2;
	}

	virtual int vpub() {
		return 3;
	}
};

class camper: private veicolo {
public:
	int vpub() {
		return 5;
	}
};

class automobile: public veicolo {
private:
	int pri() {
		return 6;
	}
public:
	int vpub() {
		return 7;
	}
};
void f_veicolo(veicolo v) {
	cout << v.pub() << " ";
	// ERR cout << v.pri() << " ";
	cout << v.vpub() << endl;
}
void f_camper(camper c) {
	// ERR cout << c.pub() << " ";
	// ERR cout << c.pri() << " ";
	cout << c.vpub() << endl;
}
void f_automobile(automobile a) {
	cout << a.pub() << " ";
	// ERR cout << a.pri() << " ";
	cout << a.vpub() << endl;
}
void f_p_veicolo(veicolo* v) {
	cout << v->pub() << " ";
	// ERR cout << v->pri() << " ";
	cout << v->vpub() << endl;
}
void f_p_camper(camper* c) {
	// ERR cout << c->pub() << " ";
	// ERR cout << c->pri() << " ";
	cout << c->vpub() << endl;
}
void f_p_automobile(automobile* a) {
	cout << a->pub() << " ";
	//ERR cout << a->pri() << " ";
	cout << a->vpub() << endl;
}
void f_r_veicolo(veicolo& v) {
	cout << v.pub() << " ";
	// ERR cout << v.pri() << " ";
	cout << v.vpub() << endl;
}
void f_r_camper(camper& c) {
	// ERR cout << c.pub() << " ";
	// ERR cout << c.pri() << " ";
	cout << c.vpub() << endl;
}
void f_r_automobile(automobile& a) {
	cout << a.pub() << " ";
	// ERR cout << a.pri() << " ";
	cout << a.vpub() << endl;
}
int main() {
	veicolo v;
	camper c;
	automobile a;
//
//1.
	f_veicolo(v);
//2.
//	f_veicolo(c);
//3.
	f_veicolo(a);
//
//4.
	f_p_veicolo(&v);
//5.
//	f_p_veicolo(&c);
//6.
	f_p_veicolo(&a);
//
//7.
	f_r_veicolo(v);
//8.
//	f_r_veicolo(c);
//9.
	f_r_veicolo(a);
}

