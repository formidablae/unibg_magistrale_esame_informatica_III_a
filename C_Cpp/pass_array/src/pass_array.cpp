//============================================================================
// Name        : pass_array.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
/*
 * Demonstrate some pecularities of array passing in C.
 *
 * Author: Tom Bennet
 */
#include <iostream>

using namespace std;

// Each version receives the same size-5 integer array from the main pgm.

// Receive it as declared in main.
void rcvA(int arr[5]) {
	cout << "A [" << sizeof arr << "]" << endl;
	for (int m = 0; m < 5; m++)
		cout << arr[m] << " ";
	for (int m = 0; m < 5; m++)
		arr[m] = 0;
	cout << endl;
}

// Receive it as the system sends it -- a pointer to the first item in the
// array.
void rcvB(int *arr) {
	cout << "B [" << sizeof arr << "]" << endl;
	for (int m = 0; m < 5; m++)
		cout << arr[m] << " ";
	cout << endl;
}

// Since it sends a pointer and ignores the array size anyway, the system
// lets you leave it out here, too.
void rcvC(int arr[]) {
	cout << "C [" << sizeof arr << "]" << endl;
	for (int m = 0; m < 5; m++)
		cout << arr[m] << " ";
	cout << endl;
}

// In fact, so long as the system is going to ignore the size anyway, we can
// write what we want.  The 1024 doesn't make the array that large,
// however; it's however large its creator made it.  rcvD can't find out.
void rcvD(int arr[1024]) {
	cout << "D [" << sizeof arr << "]" << endl;
	for (int m = 0; m < 5; m++)
		cout << arr[m] << " ";
	cout << endl;
}

int main() {

	// Here's the array all the fuss is about.
	int arr[5];

	// Put some stuff there.
	for (int i = 0; i < 5; ++i)
		arr[i] = 2 * i - 3;

	// Do exactly what the functions do.
	cout << "M [" << sizeof arr << "]" << endl;
	for (int m = 0; m < 5; m++)
		cout << arr[m] << " ";
	cout << endl;

	// Now run the functions.
	rcvA(arr);
	for (int m = 0; m < 5; m++)
		cout << arr[m] << " ";
	cout << endl;
	rcvB(arr);
	rcvC(arr);
	rcvD(arr);
	return 0;
}
