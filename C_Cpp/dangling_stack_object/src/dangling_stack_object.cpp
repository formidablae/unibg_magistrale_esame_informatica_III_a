//============================================================================
// Name        : dangling_stack_object.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class A{
public:
	int x;
};
// costruisce un puntatore ad A dangling
A* makeADangling(){
	A a;
	a.x = 100;
	return &a;
}

void cleanStack(){
	char name[] = "pippo";
}

int main() {
	A* mya = makeADangling();
	// stampo il valore di x di mya:
	// non mi accorgo nulla, vale 100 come
	// se il puntatore fosse ancora valido
	cout << "A.x = " << mya -> x <<endl;
	// riutilizzo lo stack
	cleanStack();
	// non stampa più 100, mi accorgo che mya non è valido
	cout << "A.x = " << mya -> x <<endl;
	return 0;
}
