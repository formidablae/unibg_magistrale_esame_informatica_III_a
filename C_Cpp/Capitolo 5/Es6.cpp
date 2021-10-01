/*
 * Es6.cpp
 *
 *  Created on: 21 nov 2017
 *      Author: Silvia
 */


#include <iostream>
#include<vector>
using namespace std;

class Studente{
public:
	virtual void getCorso(){cout << "Studente.getCorso" << endl;}
	void getName(){cout << "Studente.getName" << endl;}
};
class StudenteLS: public Studente{
	public: virtual void getCorso(){cout << "StudenteLS.getCorso" << endl;}
	public: void getName(){cout << "StudenteLS.getName" << endl;}

};

class StudenteIL: public Studente{
	public: virtual void getCorso(){cout << "StudenteIL.getCorso" << endl;}
	public: void getName(){cout << "StudenteIL.getName" << endl;}

};


int main(){

//Invoca i metodi della classe del tipo di oggetto creato

	/*vector<Studente*> vect;
	Studente* s = new Studente;
	vect.push_back(s);

	StudenteLS* s4 = new StudenteLS;
	vect.push_back(s4);

	StudenteIL* s7 = new StudenteIL;
	vect.push_back(s7);

	 for (unsigned i=0; i<vect.size(); i++){
	    vect.at(i)->getCorso();
	    vect.at(i)->getName();
	 }*/


	 //Invoca i metodi della classe Studente
	 
		vector<Studente> vect2;
		Studente s1;
		vect2.push_back(s1);

		StudenteLS s2;
		vect2.push_back(s2);

		StudenteIL s3;
		vect2.push_back(s3);

		 for (int i=0; i<vect2.size(); i++){
		    vect2.at(i).getCorso();
		    vect2.at(i).getName();
		 }


	return 0;
}

