/*
 ============================================================================
 Name        : te_gen08.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* epd(){
	//char ca[] = "info3 parte A";
	char * res = malloc(sizeof(char)*100);
	strcpy(res,"info3 parte A");
	return res;
}

int main(void) {
	printf("miglior corso %s",epd());
	return EXIT_SUCCESS;
}
