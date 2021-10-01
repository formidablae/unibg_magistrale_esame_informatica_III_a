#include <iostream>
using namespace std;

int& g(int& a){
	return a;
}

int hhhh() {
	int a = 8;
	int* pa = &a;
	int& ra = a;
	cout << a << " " << ra << " "<< *pa<<endl;

	int y = 90;
	pa = &y;
	ra = y;
	cout << a << " " << ra << " "<< *pa <<endl;

	int h = 9;
	g(h) = 100;
	cout << h <<endl;
}
