/*
 * AutoClasse.h
 *
 *  Created on: 19/ott/2010
 *      Author: garganti
 */

#ifndef AUTOCLASSE_H_
#define AUTOCLASSE_H_

class AutoClasse {

private:

	int speed;

public:

	AutoClasse();

	virtual ~AutoClasse();

	void speedUp();

	int getSpeed();
};

#endif /* AUTOCLASSE_H_ */
