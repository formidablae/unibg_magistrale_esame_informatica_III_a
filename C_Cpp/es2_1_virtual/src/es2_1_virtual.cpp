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
int main() {
	StudenteLS* s1 = new StudenteLS;
	/*Studente* s2 = s1;
	s2->getCorso();
	s2->getName();*/
	s1->getCorso();
	return 0;
}
