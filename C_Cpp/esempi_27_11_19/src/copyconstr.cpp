#include <iostream>
#include <cstring>
using namespace std;
class Q{public: int x; char* s = new char[60];};

int mainvv() {
	Q q1; q1.x = 90; strcpy(q1.s,"ciao");
	Q q2(q1); // copy constructor idem q2 = q1;
	cout << q1.x << " " << q1.s << " " << q2.x << " " << q2.s << endl;
	q2.x = 100;
	strcpy(q2.s,"hello");
	cout << q1.x << " " << q1.s << " " << q2.x << " " << q2.s << endl;
}
