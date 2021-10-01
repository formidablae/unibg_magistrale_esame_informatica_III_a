/*
 * stl_polimorfismo.cpp
 *
 *  Created on: 14/nov/2012
 *      Author: garganti
 */
#include <iostream>
#include <vector>
using namespace std;

class Studente{
public:
	void getName(){cout << "studente name" << endl;}
	virtual void calcVoto() {cout << "studente calcolo voto" << endl;}
};

class StudenteLS: public Studente{
public:
	void getName(){cout << "studente LS name" << endl;}
	virtual void calcVoto() {cout << "studenteLS calcolo voto" << endl;}

};
int main(int argc, char **argv) {
	//vector<Studente> classe;//NO
	vector<Studente*> classe;
	Studente giovanni;
	StudenteLS piero;
	classe.push_back(&giovanni);
	classe.push_back(&piero);
	classe[0]->getName();
	classe[1]->getName();
	classe[0]->calcVoto();
	classe[1]->calcVoto();
}
