/*
 * shape_stl.cpp
 *
 *  Created on: Nov 3, 2010
 *      Author: garganti
 */
#include <vector>
using namespace std;

class shape{};

class rectangle: public shape{};

class circle : public shape{};

/// restituisce una lista  con alcuni rettangoli e cerchi

vector<shape*>* figure(){
	//
	vector<shape*>* result = new vector<shape*>;
	rectangle* r = new rectangle;
	circle* c = new circle;
	result->push_back(r);
	result->push_back(c);
	return result;
}

shape * translate(shape* s){
	// trsnala s s.x ++ ..
	return &s;
}



