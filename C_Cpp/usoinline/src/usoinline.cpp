//============================================================================
// Name        : usoinline.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

inline void inc(int x){
	if (x > 10000) return;
	else inc(++x);
}

void f(int x, int y = 0){
	cout << x + y;
}
//void f(int x){ f(x,0);}

void m(int x, int y){}
void m(int x, double ){}

int main() {
	m(3,4);
	m(2,4.5);
	int y = 0;
	inc(y);// -> int x; x = y; x++;
	cout << y << endl;
	return 0;
	f(3,4);
	f(3);
}
