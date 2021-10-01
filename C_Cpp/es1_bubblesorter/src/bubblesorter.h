/*
 * bubblesorter.h
 *
 *  Created on: 10/dic/2014
 *      Author: garganti
 */

#ifndef BUBBLESORTER_H_
#define BUBBLESORTER_H_


class BubbleSorter{

	int* arraytoorder;
	int arrayLength;
	bool ordered;

public:
	BubbleSorter(int* array, int n);
	void sort();
    const int* getArrayOrdinato() const;
};


#endif /* BUBBLESORTER_H_ */
