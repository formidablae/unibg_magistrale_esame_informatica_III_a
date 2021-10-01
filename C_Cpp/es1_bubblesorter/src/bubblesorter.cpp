/*
 * bubblesorter.cpp
 *
 *  Created on: 10/dic/2014
 *      Author: garganti
 */

#include "bubblesorter.h"

BubbleSorter::BubbleSorter(int* array, int n){
	// if (array == NULL) || n < 0 ???
	this->arrayLength = n;
	this->arraytoorder = new int[n];
	for(int i = 0; i < n ; i++){
		this->arraytoorder[i] = array[i];
	}
}

void BubbleSorter::sort(){

}

const int* BubbleSorter::getArrayOrdinato() const{
	return arraytoorder;
}


