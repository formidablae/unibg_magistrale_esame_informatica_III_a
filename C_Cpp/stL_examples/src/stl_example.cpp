/*
 * stl_example.cpp
 *
 *  Created on: 14/nov/2012
 *      Author: garganti
 */

#include <vector>
#include <iostream>
using namespace std;

int mainnnn(int argc, char **argv) {
	vector<int> a(61);
	a[0] = 5;
	a[60] = 100;
	cout << a[0] << " " << a[60] << '\n';
	//
	vector<int> b = a; // non è alias
	b[0] = 200;
	cout << b[0] << " " << b[60] << '\n';
	cout << a[0] << " " << a[60] << '\n';

	// uso iterator
	for(vector<int>::iterator i = a.begin();
			i != a.end();i++){
		cout << *i;
	}
	// uso algoritm
	//sort()

}

