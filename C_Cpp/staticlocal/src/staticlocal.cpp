//============================================================================
// Name        : staticlocal.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void m(){
	static int n = 0;
	n++;
	cout << "hai chiamato m n volte: " <<  n << endl;
}

int main() {
	m();
	m();
	return 0;
}
