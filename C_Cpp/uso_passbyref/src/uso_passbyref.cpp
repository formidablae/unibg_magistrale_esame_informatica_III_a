//============================================================================
// Name        : uso_passbyref.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f(int& a){

}


int main() {
	int x;
	f(x);
	f(x++);// ERRORE !!!!
	return 0;
}
