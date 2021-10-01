//============================================================================
// Name        : virtualFunctions.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include <iostream>
#include <cstring>
using namespace std;

/*class Shape {
	double width;
	double height;

	char name[20];
public:
	Shape() {
		width = height = 0.0;
		strcpy(name, "unknown");
	}

	Shape(double w, double h, char *n) {
		width = w;
		height = h;
		strcpy(name, n);
	}

	Shape(double x, char *n) {
		width = height = x;
		strcpy(name, n);
	}

	void display() {
		cout << "Width and height are " << width << " and " << height << "\n";
	}

	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		width = w;
	}
	void setHeight(double h) {
		height = h;
	}
	char *getName() {
		return name;
	}

	virtual double area() {
		cout << "Error: area() must be overridden.\n";
		return 0.0;
	}

};

class Triangle: public Shape {
	char style[20];
public:

	Triangle() {
		strcpy(style, "unknown");
	}

	Triangle(char *str, double w, double h) :
		Shape(w, h, "triangle") {
		strcpy(style, str);
	}

	Triangle(double x) :
		Shape(x, "triangle") {
		strcpy(style, "isosceles");
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		cout << "Triangle is " << style << "\n";
	}
};

class Rectangle: public Shape {
public:

	Rectangle(double w, double h) :
		Shape(w, h, "rectangle") {
	}

	Rectangle(double x) :
		Shape(x, "rectangle") {
	}

	bool isSquare() {
		if (getWidth() == getHeight())
			return true;
		return false;
	}

	double area() {
		return getWidth() * getHeight();
	}
};

int main() {
	Shape *shapes[5];

	shapes[0] = &Triangle("right", 8.0, 12.0);
	shapes[1] = &Rectangle(10);
	shapes[2] = &Rectangle(10, 4);
	shapes[3] = &Triangle(7.0);
	shapes[4] = &Shape(10, 20, "generic");

	for (int i = 0; i < 5; i++) {
		cout << "object is " << shapes[i]->getName() << "\n";
		cout << "Area is " << shapes[i]->area() << "\n\n";
	}

	return 0;
}*/
