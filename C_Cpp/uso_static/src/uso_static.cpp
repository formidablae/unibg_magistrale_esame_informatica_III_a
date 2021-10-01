#include <iostream>

class Studente{
public:
	int eta;
	static int m;
	static void p(){}
};
int Studente::m = 0;

using namespace std;

int main() {
	Studente mario;
	mario.m = 0;
	Studente piero;
	cout << piero.m << endl;
	return 0;
}
