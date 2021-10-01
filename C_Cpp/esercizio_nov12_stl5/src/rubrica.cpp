/*
 * rubrica.cpp
 *
 *  Created on: 27/nov/2012
 *      Author: garganti
 */

#include "rubrica.h"
#include <map>
#include <algorithm>

void rubrica::inserisci(string* nome, string* numero) {
	this->dati.insert(make_pair(nome, numero));
}

string* rubrica::find(string* nome) {
	map<string *, string*>::iterator cur;
	cur = std::find_if(dati.begin(), dati.end(), eq);
//	cur = dati.find(nome);
	if (cur != dati.end())
		return cur->second;
	else
		return NULL;
}

// comparison
bool eq(pair<string*, string*> elem) {
    return elem.second;
}


