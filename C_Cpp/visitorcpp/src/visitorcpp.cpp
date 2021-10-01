//============================================================================
// Name        : visitorcpp.cpp
// Author      :
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include "Studente.h"
#include "Studente1L.h"
#include "StudenteLS.h"
#include <vector>

int main() {
	// dichiaro un array di ptr studenti

	vector<Studente*> classe;

	classe.push_back(new Studente);
	classe.push_back(new Studente1L);
	classe.push_back(new StudenteLS);
	for (vector<Studente*>::iterator i = classe.begin();
			i != classe.end(); ++i){
		(*i)->stampa();
	}

}

