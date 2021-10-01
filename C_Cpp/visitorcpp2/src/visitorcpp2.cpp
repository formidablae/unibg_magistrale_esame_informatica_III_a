//============================================================================
// Name        : visitorcpp2.cpp
// Author      :
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <vector>
using namespace std;

// dichiaro i tipi studente prima per poterli usare
// altrimenti ho errori nel visitor, poi le definirò

class Studente1L;
class StudenteLS;

// Visitor qualsiasi di studenti dei due tipi
class StudVisitor{

public:

	// i metodi visit sono astratti
	// uso due nomi distinti per distinguerli meglio
	virtual void visitS1L(Studente1L& x) = 0;

	virtual void visitSLS(StudenteLS& x) = 0;

};
/** visitor specifico per il colcolo della media*/
class CalcolaMedia: public StudVisitor{


public:

	// calcolo delle media per Studente primo livello
	virtual void visitS1L(Studente1L& x){
		// dovrò interrogare x che so che è di tipo Studente1L
		// TODO
		cout << "calcolo la media dello studente primo livello" << endl;
	}
	// calcolo delle media per Studente specialistico
	virtual void visitSLS(StudenteLS& x){
		// TODO
		// dovrò interrogare x che so che è di tipo StudenteLS
		cout << "calcolo la media dello studente scpecialistica" << endl;
	}

};

class Studente{

public:

	Studente(){}

	virtual void accept(StudVisitor& ) = 0;

};

class Studente1L: public Studente{

public:
	Studente1L(){}

	virtual void accept(StudVisitor& v){
		v.visitS1L(*this);
	}

};

class StudenteLS: public Studente{

public:

	StudenteLS(){}

	virtual void accept(StudVisitor& v){
		v.visitSLS(*this);
	}

};


int main() {
	// dichiaro un array di ptr a Studenti
	// uso i puntatori per il binding dinamico
	vector<Studente*> classeMista;
	classeMista.push_back(new Studente1L);
	classeMista.push_back(new StudenteLS);
	CalcolaMedia calc;
	// chiamo accept del calcolo
	// il pattern adrà tramite il double dispatch a prendere il corpo del metodo adatto
	classeMista.at(0)->accept(calc);
	classeMista.at(1)->accept(calc);
	return 0;
}
