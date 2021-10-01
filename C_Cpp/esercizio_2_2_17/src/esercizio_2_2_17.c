/*
 ============================================================================
 Name        : esercizio_2_2_17.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void modify(char* s){
	strcpy(s+ strlen(s) +1,"oooooo");
}



int main(void) {
	char a1[] = "pippo";
	char a2[] = "pluto";
	printf("%s %s\n", a1,a2);
	// passo a2 ma modifico a1
	modify(a2);
	printf("%s %s\n", a1,a2);
	return EXIT_SUCCESS;
}
