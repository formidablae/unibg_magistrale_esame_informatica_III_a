/*
 ============================================================================
 Name        : esericizio_25_9_19.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void togli1char(char* s){
	//s++;
	for(;*s!='\0';s++)
		*s = *(s+1);
	printf(" nella funzione %s\n",s);
}
void togli1charPP(char** s){
	(*s)++;
}

int main(void) {
	char nome[] = "Pascoli";
	printf("prima %d %d \n", sizeof(nome), strlen(nome));
	printf("prima %s\n", nome);
	togli1char(nome);
	printf("dopo %s\n", nome);
	printf("dopo %d %d\n", sizeof(nome), strlen(nome));
	//
	// oppure passando il puntatore al puntatore
	char* autore = nome;
	printf("prima %s\n", autore);
	togli1charPP(&autore);
	printf("dopo %s\n", autore);
	return EXIT_SUCCESS;
}
