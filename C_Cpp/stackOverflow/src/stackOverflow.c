#include <stdio.h>
#include <stdlib.h>
// esempio di stack overflow
int f(int n) {
	int x;
	printf(".");
	x = f(n);
	return x;
}

int main() {
	f(10);
	return EXIT_SUCCESS;
}
