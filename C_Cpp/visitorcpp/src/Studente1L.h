/*
 * Studente1L.h
 *
 *  Created on: Dec 5, 2008
 *      Author: garganti
 */

#ifndef STUDENTE1L_H_
#define STUDENTE1L_H_

#include "Studente.h"

class Studente1L: public Studente {


public:
	Studente1L();
	virtual ~Studente1L();

	void stampa();

	void accept(Visitor& );


};

#endif /* STUDENTE1L_H_ */
