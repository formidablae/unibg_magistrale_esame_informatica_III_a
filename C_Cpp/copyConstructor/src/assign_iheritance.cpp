/*
 * assign_iheritance.cpp
 *
 *  Created on: Nov 2, 2010
 *      Author: garganti
 */
#include <string>
#include <iostream>

using namespace std;

class Person {

public:
	string name;
	Person(string n) {
		name = n;
	}
	virtual void print() {
		cout << name;
	}
};

class Student: public Person {
protected:
	string school;
public:
	Student(string n, string s): Person(n){school = s;}
	virtual void print(){
		Person::print(); cout << school;
	}
};

void prova_assi_virtual() {
	Person p("pippo");
	Student s("pluto", "unimi");
	//
	p = s;
	cout << p.name;
	p.print();
}

int main() {
	prova_assi_virtual();
}
