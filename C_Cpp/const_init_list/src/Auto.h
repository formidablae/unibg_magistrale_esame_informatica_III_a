/*
 * Auto.h
 *
 *  Created on: 19/ott/2010
 *      Author: garganti
 */

#ifndef AUTO_H_
#define AUTO_H_

class Auto {

private:
	int speed;
	char targa[8];
	int eta;
	Auto sorella;

public:
	Auto();
	virtual ~Auto();
};


#endif /* AUTO_H_ */
