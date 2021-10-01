
#include <stdio.h>
#include <stdlib.h>

void f(void) {
	int* x = malloc(10 * sizeof(int));
	x[0] = 10;
	x[10] = 0;
	free(x);
}

int main(void) {
	f();
	return 0;
}

