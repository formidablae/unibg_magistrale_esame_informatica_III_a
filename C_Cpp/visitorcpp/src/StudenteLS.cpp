/*
 * StudenteLS.cpp
 *
 *  Created on: Dec 5, 2008
 *      Author: garganti
 */

#include "StudenteLS.h"
#include <iostream>
using namespace std;

StudenteLS::StudenteLS() {
	// TODO Auto-generated constructor stub

}

StudenteLS::~StudenteLS() {
	// TODO Auto-generated destructor stub
}
void StudenteLS::stampa() {
	cout << "studente LS" << endl;
}

void StudenteLS::::visit(Visitor & visitor) {
	return visitor.visitSt1l(*this);

}
