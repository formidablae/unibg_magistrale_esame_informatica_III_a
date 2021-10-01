/*
 * Studente.h
 *
 *  Created on: Oct 26, 2011
 *      Author: garganti
 */

#ifndef STUDENTE_H_
#define STUDENTE_H_

#include <string>
using namespace std;

class Studente {
public:
	Studente();
	Studente(char * n);
	virtual ~Studente();
	int getMatricola();
	void print() const;
private:
	int matricola;
	string nome;
};

#endif /* STUDENTE_H_ */
