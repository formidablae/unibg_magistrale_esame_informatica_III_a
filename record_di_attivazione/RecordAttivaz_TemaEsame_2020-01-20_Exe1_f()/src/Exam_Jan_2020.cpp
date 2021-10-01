//============================================================================
// Name        : Exam_Jan_2020.cpp
// Author      : Michele Piffari
// Version     :
// Copyright   : No copyright
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int K = 2;

int f(int a, int* b, int& c){
	cout << "Contents of b " << b << endl;
	cout << "Address of c " << &c << endl;
	if(a < K) {
		cout << "Address pointed by b " << b << endl;
		(*b)++;
		c++;
		return *b + f(*b,&a,c);
	} else {
		b++;
		return a * 10;
	}
}

int main() {
	int i = 0;
	int *j = &i;
	int &k = i;
	cout << "Address of i " << &i << endl;
	cout << "Contents of j(b) " << j << endl;
	cout << "Address of k(c) " << &k << endl;
	cout << f(i,j,k) << endl;
	cout << i << endl;
	cout << j << endl;
	cout << k << endl;
	cout << "No greetings" << endl; // prints No greetings
	return 0;
}
