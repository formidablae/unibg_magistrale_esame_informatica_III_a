/*
 * studente.c
 *
 *  Created on: Oct 19, 2011
 *      Author: garganti
 */
#include "studente.h"
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

#define MAX_CHAR_NAMES 100

static int num_studenti = 0;

struct studente{
	int matricola;
	char name[MAX_CHAR_NAMES];
	char* cognome;
};

studenteRef mkStudente(char * n, char * c){
	studenteRef res = malloc(sizeof(struct studente));
	strncpy(res->name,n,100);
	res->cognome = malloc(sizeof(char)*100);
	strncpy(res->cognome,c,100);
	res->matricola = ++num_studenti;
	return res;
}

void printStudente(studenteRef s){
	printf("%i  %s %s\n", s->matricola, s->name, s->cognome);
}

int getMatricola(studenteRef s){
	return s->matricola;
}

void deleteStudente(studenteRef* s){
	studenteRef sr = *s;
	struct studente  ss = *sr;
	free(ss.cognome);
	free(*s);
	sr = NULL;
}
