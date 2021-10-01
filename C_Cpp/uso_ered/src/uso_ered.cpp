//============================================================================
// Name        : uso_ered.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Persona {
private:
	int eta;
protected:
	int getEta() {
		return eta;
	}
public:
	Persona(int y) {
		eta = y;
	}
	int NTel() {
		return 0;
	}
};

class Studente: public Persona {
public:
	Studente() :
			Persona(20) {
		//eta = 20;
		cout << getEta() << endl;
	}

};
