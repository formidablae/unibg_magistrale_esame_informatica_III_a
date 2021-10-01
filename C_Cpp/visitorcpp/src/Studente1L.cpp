/*
 * Studente1L.cpp
 *
 *  Created on: Dec 5, 2008
 *      Author: garganti
 */

#include "Studente1L.h"
#include "Visitor.h"

#include <iostream>
using namespace std;

Studente1L::Studente1L() {
	// TODO Auto-generated constructor stub

}

Studente1L::~Studente1L() {
	// TODO Auto-generated destructor stub
}
void Studente1L::stampa(){
	cout << "studente 1L" << endl;
}

void Studente1L::accept(Visitor& visitor){
	return visitor.visitSt1l(*this);
}

