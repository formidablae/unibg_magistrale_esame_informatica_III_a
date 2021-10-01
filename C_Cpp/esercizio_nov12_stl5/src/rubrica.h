/*
 * rubrica.h
 *
 *  Created on: 27/nov/2012
 *      Author: garganti
 */

#ifndef RUBRICA_H_
#define RUBRICA_H_
#include <string>
#include <map>

using namespace std;


class rubrica{
private:
	map<string*,string*> dati;
public:
	rubrica(){}
	void inserisci(string* nome, string* numero);
	string* find(string* nome);
};

#endif /* RUBRICA_H_ */
