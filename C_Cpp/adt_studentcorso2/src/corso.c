/*
 * corso.c
 *
 *  Created on: Oct 26, 2011
 *      Author: garganti
 */
#include "corso.h"
#include "stdlib.h"
#include <string.h>

#define MAX_CHAR_CORSO 40

struct nodo{
	studenteRef s;
	struct nodo* next;
};

struct corso{
	char nome[MAX_CHAR_CORSO];
	//
	struct nodo* lista;
	// alternativa
	//studenteRef classe[100];
};

corsoRef mkCorso(char *n){
	corsoRef c = malloc(sizeof(struct corso));
	strncpy(c->nome,n,MAX_CHAR_CORSO);
	c->lista = NULL;
	return c;
}

void addStudent(corsoRef c, studenteRef s){
	// creonuovo nodo
	struct nodo * n = malloc(sizeof(struct nodo));
	n->s = s;
	// inserisco in testa
	n->next = c->lista;
	c->lista = n;
}
