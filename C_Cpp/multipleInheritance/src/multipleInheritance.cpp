//============================================================================
// Name        : multipleInheritance.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include "L.h"
#include "B2.h"
#include "B3.h"
#include "D.h"


int main() {
	D* d = new D;
	d->printI();
	return 0;
}
