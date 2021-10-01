#include "stdio.h"

int main() {

	int a = 10;
	int b = 20;
	int* x = &b;

	x = x + 1;

	*x = 5;

	//int y;// = *x;

	//printf("y vale %d\n",y);
	printf("b vale %d", b);
	printf("a vale %d", a);
//     getch();
}

void f(int x[]) {
	x[10] = 20;
	*(x + 10) = 20;
}
