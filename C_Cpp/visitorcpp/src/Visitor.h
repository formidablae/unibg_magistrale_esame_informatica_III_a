/*
 * Visitor.h
 *  Created on: Dec 5, 2008
 *      Author: garganti
 */

#ifndef VISITOR_H_d
#define VISITOR_H_

#include "Studente1L.h"
#include "StudenteLS.h"

class Visitor {

  public:

	virtual ~Visitor();

	virtual void visitSt1l(Studente1L & );
	virtual void visitStLS(StudenteLS & );

};

#endif /* VISITOR_H_ */
