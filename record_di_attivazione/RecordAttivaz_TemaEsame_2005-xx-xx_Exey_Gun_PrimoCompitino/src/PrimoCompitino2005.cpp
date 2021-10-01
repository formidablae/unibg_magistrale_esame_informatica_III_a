//============================================================================
// Name        : TemaEsame_2005-PrimoCompitino_Exe_RecordAttivazione.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int gun(int a);
int foo(int a, int b);

int a, x;

int foo(int a, int b) {
	int c = 5;
	if (a == b) return x;
	else return gun(c);
}

int gun(int a) {
	return foo(0,0) + 4 ;
}

int main() {
	a = 0; x = 8;
	{
		int x, y;
		x = 0; y = 7;
		a = foo(x,y);
	}
	cout << "a = " << a << endl;
	return 0;
}
