//============================================================================
// Name        : private_ineritance.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
class Base0
{
private:
  void private_method_of_B();
};

class Derived0:
  public Base0
{
};

int foo()
{
  Derived0 d;
  //d.private_method_of_B();
  //d.method_that_does_not_exist();
}
