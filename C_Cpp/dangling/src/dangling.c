/*
 ============================================================================
 Name        : dangling.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

char* itoa(int i){
	char buf[100];
	//char *pbuf = malloc(100*sizeof(char));
	sprintf(buf,"%d",i);
	return buf;
}

int main(void) {
	char* uno = itoa(1);
	printf(" uno -> %s", uno);
	return EXIT_SUCCESS;
}
