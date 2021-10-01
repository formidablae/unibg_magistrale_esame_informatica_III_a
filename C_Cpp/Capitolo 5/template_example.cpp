//============================================================================
// Name        : stL_examples.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

template <int nome_size> class Studente {
private:
	char nome[nome_size];
};

template<typename T> T massimo(T a, T b) {
	if (a >= b)
		return a;
	else
		return b;
}
class A {
};




int main() {
	int y = massimo(3,4);
	cout << y << endl;
	string s1 = "pippo";
	string s2 = "pluto";
	cout << massimo(s1, s2) << endl;
	//
	A a1, a2;
	cout << massimo(a1,a2) << endl;

	return 0;
}
