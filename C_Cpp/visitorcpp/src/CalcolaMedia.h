/*
 * CalcolaMedia.h
 *
 *  Created on: Dec 5, 2008
 *      Author: garganti
 */

#ifndef CALCOLAMEDIA_H_
#define CALCOLAMEDIA_H_
#include "Visitor.h"

class CalcolaMedia: public Visitor{

public:
	CalcolaMedia();
	virtual ~CalcolaMedia();

	void visitSt1l(Studente1L&);
	void visitStLS(StudenteLS&);

};

#endif /* CALCOLAMEDIA_H_ */
