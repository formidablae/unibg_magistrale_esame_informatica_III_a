/*
 * listainterin.c
 *
 *  Created on: 25 nov 2015
 *      Author: garganti
 */

#include "listainterin.h"
#include <stdlib.h>

typedef struct listarecord{
	int N; // dimensione
	int* data;
} * ListaInteriN;

ListaInteriN makeListaInteriN(int n){
	ListaInteriN result = malloc(sizeof(struct listarecord));
	result->N = n;
	result->data = malloc(sizeof(int)*n);
	return result;
}

void set(ListaInteriN l,int i,int j){
	// se sono fuori dalla lista
	if (i >= l->N || i < 0 ) return;
	l->data[i] = j;
}

int get(ListaInteriN l,int i){
	if (i >= l->N || i < 0 ) return 999;
	return l->data[i];

}

void deleteListN(ListaInteriN l){
	free(l->data);
	free(l);
}

