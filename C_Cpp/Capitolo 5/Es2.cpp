//============================================================================
// Name        : es2_1_virtual.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Studente{
public:
	virtual void getCorso(){cout << "Studente.getCorso" << endl;}
	void getName(){cout << "Studente.getName" << endl;}
};
class StudenteLS: private Studente{
	virtual void getCorso(){cout << "StudenteLS.getCorso" << endl;}
	void getName(){cout << "StudenteLS.getName" << endl;}

};

class StudenteIL: private Studente{
	virtual void getCorso(){cout << "StudenteIL.getCorso" << endl;}
	void getName(){cout << "StudenteIL.getName" << endl;}

};

int main() {
	Studente* s = new Studente;
//	Studente* s1 = new StudenteLS;
//	Studente* s2 = new StudenteIL;
//	StudenteLS* s3 = new Studente;
	StudenteLS* s4 = new StudenteLS;	
//	StudenteLS* s4 = new StudenteIL;
//	StudenteIL* s5 = new Studente;
//	StudenteIL* s6 = new StudenteLS;
	StudenteIL* s7 = new StudenteIL;
	/*Studente* s2 = s1;
	s2->getCorso();
	s2->getName();*/
//	s1->getCorso();
s->getCorso();
s->getName();
s4->getCorso();
s4->getName();
s7->getCorso();
s7->getName();

	return 0;
}
