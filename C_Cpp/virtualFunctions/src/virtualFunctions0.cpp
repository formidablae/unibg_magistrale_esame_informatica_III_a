//============================================================================
// Name        : virtualFunctions.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

using namespace std;

class Shape {

public:
	Shape() {
	}

	void display() {
		cout << "S" << "\n";
	}

	virtual void area() {
		cout << "E\n";
	}

};

class Triangle: public Shape {
public:

	Triangle() {
	}

	void display() {
		cout << "T" << "\n";
	}

	void area() {
		cout << "AT" << "\n";
	}

};

int main() {
	Shape s1 = Triangle();
	s1.display(); // -> S
	s1.area(); // -> E

	Triangle t1 = Triangle();
	t1.display(); // -> T
	t1.area(); // -> AT

	Shape *ps1 = new Triangle();
	ps1->display(); //  -> S
	ps1->area() ; // -> AT

	Shape *ps2 = new Shape();
	ps2->display(); // -> S
	ps2->area(); // -> E

	Triangle *pt1 = new Triangle();
	pt1->display(); // -> T
	pt1->area(); // -> AT

}
