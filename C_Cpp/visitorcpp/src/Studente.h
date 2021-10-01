/*
 * Studente.h
 *
 *  Created on: Dec 5, 2008
 *      Author: garganti
 */

#ifndef STUDENTE_H_
#define STUDENTE_H_
#include "Visitor.h"

class Studente {
public:
	Studente();
	virtual ~Studente();

	virtual void accept(Visitor& );

};

#endif /* STUDENTE_H_ */
