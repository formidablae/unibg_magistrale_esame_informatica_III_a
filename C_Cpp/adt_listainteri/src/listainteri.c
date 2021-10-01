/*
 * listainteri.c
 *
 *  Created on: Oct 26, 2011
 *      Author: garganti
 */

#include "listainteri.h"
#include <stdlib.h>
#include <stdio.h>

struct NodoInt{
	int dato;
	struct NodoInt * next;
};

struct ListaInteri{
	struct NodoInt * head;
};

ListaInteriRef  mkListaInteri(){
	ListaInteriRef res = malloc(sizeof(struct ListaInteri));
	res->head = NULL;
	return res;
}

// aggiunge x alla lista (in testa)
void add(ListaInteriRef lista, int x){
	struct NodoInt * nd = malloc(sizeof(struct NodoInt));
	nd->dato = x;
	nd->next = lista->head;
	lista->head = nd;
}

void printNode(struct NodoInt* n){
	if (n == NULL) return;
	printf(" %d ", n->dato);
	printNode(n->next);
}

void print(ListaInteriRef lista){
	printNode(lista->head);
}


