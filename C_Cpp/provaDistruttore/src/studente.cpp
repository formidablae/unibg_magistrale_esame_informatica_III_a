/*
 * studente.cpp
 *
 *  Created on: 11 nov 2015
 *      Author: garganti
 */

#include "studente.h"
#include <iostream>
using namespace std;


studente::studente() {
	x = 100;
	name = new char[100];
	cout << "costruttore" << endl;
}

studente::~studente() {
	//delete [] name;
	cout << "distruttore" << endl;
}

void studente::moo(void){
	//x = 100;

}
