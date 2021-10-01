/*
 * BubbleSorter.h
 *
 *  Created on: 12/nov/2013
 *      Author: garganti
 */

#ifndef BUBBLESORTER_H_
#define BUBBLESORTER_H_

class BubbleSorter {
	int * numbers;
	int n;
public:
	BubbleSorter(int *, int n);
	virtual ~BubbleSorter();
	void sort();
	int * getArrayOrdinato();
	int getSize();
};

#endif /* BUBBLESORTER_H_ */
