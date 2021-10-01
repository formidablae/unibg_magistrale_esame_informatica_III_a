/*
 * D.cpp
 *
 *  Created on: Nov 17, 2009
 *      Author: garganti
 */
#include <iostream>
#include "D.h"
using namespace std;

D::D():B2(),B3() {
	// TODO Auto-generated constructor stub

}

D::~D() {
	// TODO Auto-generated destructor stub
}

void D::printI(){
//	cout << "intero di d" << i << endl;
	cout << "intero i di d " << B2::i << endl;
	cout << "intero i di d " << B3::i << endl;
}
