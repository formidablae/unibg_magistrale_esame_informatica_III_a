/*
 ============================================================================
 Name        : fibTR.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int fib(int n, int fi1, int fi2){
	if (n == 0) return fi2;
	if (n == 1) return fi1;
	return fib(n-1, fi1 + fi2, fi1);
}

int main(void) {
	printf("%d",fib(5,1,0));
	puts("!!!Hello World!!!"); /* prints !!!Hello World!!! */
	return EXIT_SUCCESS;
}
