//============================================================================
// Name        : TE_gen_10_es2.cpp
// Author      : Gargantini
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <stdio.h>


void modifyInt (int n) {
  n = 15;
}

void modifyIntR (int& n) {
  n = 15;
}

void modifyArray (int n[]) {
  n[0] = 15;
}

int main (void) {

  int x = 1;
  int y[10] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

  modifyInt(x);
  modifyInt(y[1]);
  modifyIntR(y[2]);
  modifyArray(y);

  printf("The value of x is %d\n", x);
  printf("The value of y[0] is %d\n", y[0]);
  printf("The value of y[1] is %d\n", y[1]);
  printf("The value of y[2] is %d\n", y[2]);

}
