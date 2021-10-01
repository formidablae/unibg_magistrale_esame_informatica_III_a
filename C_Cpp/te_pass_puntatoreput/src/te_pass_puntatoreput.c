/*
 ============================================================================
 Name        : te_pass_puntatoreput.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void rfc(char** x){
	(*x)++;
	printf("%s\n",x);
}

int main(void) {
	char a[] = "pippo";
	char * p = a;
	printf("%s\n",p); // -> pippo
	rfc(&p);
	printf("%s\n",p); // -> ippo
	return EXIT_SUCCESS;
}
