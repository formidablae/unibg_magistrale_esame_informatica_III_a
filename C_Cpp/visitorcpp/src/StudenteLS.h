/*
 * StudenteLS.h
 *
 *  Created on: Dec 5, 2008
 *      Author: garganti
 */

#ifndef STUDENTELS_H_
#define STUDENTELS_H_

#include "Studente.h"
#include "Visitor.h"

class StudenteLS : public Studente {
public:
	StudenteLS();
	virtual ~StudenteLS();

	virtual void accept(Visitor& );

};

#endif /* STUDENTELS_H_ */
