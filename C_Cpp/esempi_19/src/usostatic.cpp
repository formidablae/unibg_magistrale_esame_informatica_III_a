/*
 * usostatic.cpp
 *
 *  Created on: 20 nov 2019
 *      Author: garganti
 */
#include <iostream>
using namespace std;

void foo5(){
	static int x = 0;
	cout << x << endl;
	x += 5;
}

int main() {
	foo5();
	foo5();
	foo5();
}


