/*
 * BubbleSorter.cpp
 *
 *  Created on: 12/nov/2013
 *      Author: garganti
 */

#include "BubbleSorter.h"

BubbleSorter::BubbleSorter(int a[], int n): n(n){
	numbers = new int[n];
	for (int i = 0; i < n; i++) {
		numbers[i] = a[i];
	}
}

BubbleSorter::~BubbleSorter() {
	delete[] numbers;
}

int * BubbleSorter::getArrayOrdinato() {
	return numbers;
}

void BubbleSorter::sort() {
	bool ordinato = false;
	while (!ordinato) {
		ordinato = true;
		for (int i = 1; i < n; i++) {
			if (numbers[i] < numbers[i - 1]) {
				int temp = numbers[i];
				numbers[i] = numbers[i - 1];
				numbers[i - 1] = temp;
				ordinato = false;
			}
		}
	}
}

