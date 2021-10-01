/*
 * provaTemp.cpp
 *
 *  Created on: Oct 26, 2011
 *      Author: garganti
 */

class A{
	float y;
public:
	int c;
};
class B: private  A{
 void fff(){
	 c = 0;
 }
};


void foo(){
	A* b = new B;
}
