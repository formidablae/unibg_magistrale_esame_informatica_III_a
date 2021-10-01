/*
 * Time.h
 *
 *  Created on: Nov 10, 2009
 *      Author: garganti
 */

#ifndef TIME_H_
#define TIME_H_

class Time {
public:
	Time();
	void setTime(int, int, int);
	void printMilitary();
	void printStandard();
private:
	int hour;
	int min;
	int sec;
};

#endif /* TIME_H_ */
