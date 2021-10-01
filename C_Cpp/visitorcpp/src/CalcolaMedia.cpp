/*
 * CalcolaMedia.cpp
 *
 *  Created on: Dec 5, 2008
 *      Author: garganti
 */

#include "CalcolaMedia.h"
#include <iostream>
using namespace std;



CalcolaMedia::CalcolaMedia() {
	// TODO Auto-generated constructor stub

}

CalcolaMedia::~CalcolaMedia() {
	// TODO Auto-generated destructor stub
}

void CalcolaMedia::visitSt1l(Studente1L& stl){
	cout << " calcolo della media per studente primo livello " << endl;
}

void CalcolaMedia::visitStLS(StudenteLS& x){
	cout << " calcolo della media per studente laurea spec" << endl;

}
