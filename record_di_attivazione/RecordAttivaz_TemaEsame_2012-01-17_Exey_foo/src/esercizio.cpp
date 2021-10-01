/*
 * esercizio.c
 *
 *  Created on: Feb 4, 2020
 *      Author:
 */

#include <iostream>
using namespace std;

int foo(int &y);
int g(int A);

int A = 9;

int foo(int &y) {
	y++;
	if (y > 0 ) {
		int q = 10;
		A = y;
		return g(y);
	} else {
		int y = 90;
		return foo(y);
	}
}

int g(int A) {
	int x = 10;
	return A+ x;
}

int main() {
	int q = -50 + A;
	cout << "1. " << foo(q) << endl;
	cout << "2. " << q<< endl;
	return 0;
}
