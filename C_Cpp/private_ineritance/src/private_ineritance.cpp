//============================================================================
// Name        : private_ineritance.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class Base
{
public:
  void operate_on(){ do_operate_on();};
private:
  virtual void do_operate_on() {cout << "Base" << endl;};
};

class Derived: public Base
{
  void do_operate_on(){cout << "Derived" << endl;}
};


int main()
{
  Base* p = new Derived;
  p->operate_on();

  delete p;
}

