#include <cstdlib>
#include <iostream>

using namespace std;

int f1(int& x) {
	x = x + 1;
	return x;
}

int main(int argc, char *argv[]) {
	int y = 0;
	cout << "f1(y) " << f1(y) << endl;
	cout << "y: " << y << endl;

	return EXIT_SUCCESS;
}
