/*
 ============================================================================
 Name        : puntatore_puntatore.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void trunc(char * q){
	while(*q){
		*q = *(q+1);
		q++;
	}
}
// questo modifica solo localmente
void trunc2(char *q){
	q++;
	printf("q: %s\n",q);
}
// con puntatore a puntatore
void trunc3(char **q){
	(*q)++;
}


void main(void) {
	char nome[] = "Giovanni";
	char * p = nome;
	trunc3(&p);
	printf("%s\n",nome);
	printf("%s\n",p); // --> iovanni
}
