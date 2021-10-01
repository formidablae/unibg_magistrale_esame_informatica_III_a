/*
 * Studente.cpp
 *
 *  Created on: Oct 26, 2011
 *      Author: garganti
 */

#include "Studente.h"
#include <iostream>

extern int constmag;

Studente::Studente() {
	cout << "costruisco"<<endl;
	matricola = constmag++;

}

Studente::Studente(char *n):matricola(0), nome(n) {
	//string::nome(n);
	matricola = constmag++;
	cout << "costruisco n"<<endl;
}

Studente::~Studente() {
	cout << "distruggo"<<endl;
}

void Studente::print() const{
	cout << nome << " " << matricola;
}

int Studente::getMatricola(){
	return matricola;
}

