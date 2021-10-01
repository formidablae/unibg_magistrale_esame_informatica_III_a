#include <stdio.h>

int* foo(int y){
	int h = y;
	int* p = &h;
	return p;
}

int main(void){
	int* p = foo(3);
	printf("%d\n",*p);
}
