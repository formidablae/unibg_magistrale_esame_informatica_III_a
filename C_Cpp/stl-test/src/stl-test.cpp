//============================================================================
// Name        : stl-test.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <vector>

using namespace std;

int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	vector<int> numbers;
	for(int i = 1; i <= 10; i++){
		numbers.push_back(i);
	}
	// stampo
	for(vector<int>::iterator i = numbers.end(); i != numbers.begin();){
		i --;
		cout << *i;
	}
	return 0;
}
