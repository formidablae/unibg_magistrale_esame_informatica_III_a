/*
 ============================================================================
 Name        : uso_struct.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

struct studente{
	char nome[30];
	char cognome[30];
};

void printStudente(struct studente * s){
	printf("%d\n",sizeof(s));
}



int main(void) {
	struct studente s;
	printf("%d\n",sizeof(s));
	//strcpy(s.nome,"angelo");
	printStudente(&s);
	return EXIT_SUCCESS;
}
