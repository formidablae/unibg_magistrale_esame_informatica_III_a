//============================================================================
// Name        : copyconstructor2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
class Studente{
public:
	int eta;
	int* nome;

Studente(const Studente& s){
	eta = s.eta;
	nome = new int;
	*nome = *(s.nome);
}
};

#include <iostream>
using namespace std;

int main() {
	Studente s1;
	s1.eta = 20;
	s1.nome = new int;
	*s1.nome = 20;
	//
	cout << s1.eta << " " << *s1.nome << endl;

	// COPIA DI s1
	Studente s2 = s1;
	cout << s2.eta << " " << *s2.nome << endl;

	// s2 modifico
	s2.eta ++;
	(*s2.nome)++;
	cout << s2.eta << " " << *s2.nome << endl;
//
	cout << s1.eta << " " << *s1.nome << endl;
	return 0;
}
