//============================================================================
// Name        : covariance.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

// Just create a class, and a subclass
class A {};

class Bar : public A {};

class Baz
{
public:
  virtual A * create()
    {
      return new A();
    }
};

class Quux : public Baz
{
public:
  // Different return type, but it's allowed by the standard since Bar
  // is derived from Foo
  virtual Bar * create()
    {
      return new Bar();
    }
};

int main()
{
  Quux *tmp = new Quux();
  Bar *bar = tmp->create();

}
