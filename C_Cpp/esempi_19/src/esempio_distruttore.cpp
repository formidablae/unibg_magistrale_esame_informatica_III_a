/*
 * esempio_distruttore.cpp
 *
 *  Created on: 20 nov 2019
 *      Author: garganti
 */
#include <iostream>
class A{
	int* ptr;
public:
	A(){ std::cout << "A creato" << std::endl; ptr = new int[50];}
	~A(){
		std::cout << "A distrutto" << std::endl; // TODO
		delete [] ptr;
	}
};

void foo(){
	A a;
	std::cout << " fine foo" << std::endl;
}

int mainmmm(){
	foo();
	int i = 9;
	int* pi = &i;
	// sbagliato: non fate delete di puntatore sullo stack
	delete pi;
	pi = NULL; // da dangling a NULL
	*pi = 90;
	std::cout << " fine main" << std::endl;
}



