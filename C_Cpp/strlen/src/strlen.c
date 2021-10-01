/*
 ============================================================================
 	 Name        : strlen.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int strlen(char *s){
	if (s == NULL) return 0;
	int i = 0;
	while(s[i]!='\0'){
		i++;
	}
	return i;
}

int main(void) {
	char p[3] = {'a','b','c'};
	char q[3] = {'w','x','z'};
	//char * pippo = NULL;
	printf("%s è lunga %d",p,strlen(p));
	return EXIT_SUCCESS;
}
