#include <iostream>
#include <cstring>
using namespace std;

void m(int x, int y = 0){
	cout << " x " << x << " y " << y << endl;
}
int main() {
	m(4);
	m(7,8);
}
