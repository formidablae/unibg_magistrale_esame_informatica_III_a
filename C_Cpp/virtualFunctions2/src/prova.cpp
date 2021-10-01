#include <iostream>

using namespace std;

class Persona {
public:
	void printName(){cout << "name persona"<< endl;}
	virtual	void printData() { cout << "Persona"<< endl;}
};
class Studente: public Persona{
public:
	// redefinining
	void printName(){cout << "name studente" << endl;}
	// Overriding
	virtual	void printData() {cout << "Studente"<< endl;}
};
void f(int &y){}
int main(int argc, char **argv) {
	// variabili riferimento
	int h = 0;
	int & ri = h;




	int* pi;
	//
	f(ri);
	int y = ri;

	Persona * p = new Studente;
	p->printData();
	p->printName();
	// NON PUNTATORI NO BYNING DINAMICO:
	Studente s;
	Persona ps = s;
	ps.printData();
	ps.printName();

}

