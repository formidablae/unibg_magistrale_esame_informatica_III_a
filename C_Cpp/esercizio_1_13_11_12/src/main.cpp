/*
 * main.cpp
 *
 *  Created on: 12/nov/2013
 *      Author: garganti
 */
#include <iostream>
#include "BubbleSorter.h"
using namespace std;

int main(int argc, char **argv) {
	int prova[] = {5,6,3,100,8};
	int n = sizeof(prova)/sizeof(int);
	BubbleSorter bs(prova,n);
	bs.sort();
	for(int i = 0; i < n; i++)
		cout<< bs.getArrayOrdinato()[i] << " ";
}



