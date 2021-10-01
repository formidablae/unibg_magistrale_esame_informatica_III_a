/*
 * ora.h
 *
 *  Created on: 24/ott/2012
 *      Author: garganti
 */

#ifndef ORA_H_
#define ORA_H_

class Ora{
private:
	int ora;
	int min;
	int sec;
public :
	Ora();
	Ora(int);
	void setMin(int m);
	void printMilitary();
};


#endif /* ORA_H_ */
