//============================================================================
// Name        : time_temp.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class time {
private:
	int hour;
	int min;
	int sec;
public:
	time();
	time(int h);
	time(int h,int m,int s);
	void printMilitary();
	void printOrdinary();
};

time::time(): min(0), sec(0), hour(0){
	//min = sec = hour = 0;
}
time::time(int h) {
	min = sec = 0;
	hour = h;
}
time::time(int h, int m, int s) {
	min = m;
	sec = s;
	hour = h;
}

void time::printMilitary() {
	cout << hour << ":" << min << ":" << sec << endl;
}

void printOrdinary(struct time t);

int main() {
	int * pi = new int[10];
	time* t1 = new time(12,15,18);
	t1->printMilitary();
	return 0;
}
