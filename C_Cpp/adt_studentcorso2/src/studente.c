/*
 * studente.c
 *
 *  Created on: Oct 26, 2011
 *      Author: garganti
 */

#ifndef STUDENTE_C_
#define STUDENTE_C_

#include "studente.h"
#include <stdlib.h>
#include <string.h>
#include <stdio.h>

#define MAX_CHAR_NOME 10

static int numero_studenti = 0;

struct studente{
	char nome[MAX_CHAR_NOME];
	char* cognome;
	int matricola;
};

studenteRef mkStudente(char *n, char *c){
	// creo studente
	studenteRef ris = malloc(sizeof(struct studente));
	// inizializzo
	int cl = strlen(c) + 1;
	ris->cognome = malloc(sizeof(char)*cl);
	strcpy(ris->cognome,c);
	//
	strncpy(ris->nome,n,MAX_CHAR_NOME);
	// matricola
	ris->matricola = ++numero_studenti;
	return ris;
}

void printStudente(studenteRef s){
	printf("%d %s %s\n",s->matricola,s->nome, s->cognome);
}

void deleteStudente(studenteRef* s){
	free((*s)->cognome);
	free(*s);
	*s = NULL;
}

#endif /* STUDENTE_C_ */
