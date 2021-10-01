
#include <iostream>
using namespace std;
template<typename T> void f(T a, T b){}
template<typename T> T piuUno(T a){return a+1;}

template<typename T> T max(T a, T b){
	return a > b? a: b;
}

class A{};

int mainjj() {
	string s("ciao");
	cout << s;
	s = "kkk";
	int y = 9; float d;
	//f(d,y);
	cout << piuUno(y) << endl;
	A a;
	// ERRORE NON HA + cout << piuUno(a) << endl;
	return 0;
}
