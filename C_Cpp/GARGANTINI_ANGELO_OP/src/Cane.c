/*
 * Cane.c
 *
 *  Created on: 20/gen/2015
 *      Author: utente
 */
#include <stdio.h>
#include "Cane.h"
#include <stdlib.h>
#include <string.h>


struct cane{
	char* nome;
};

Cane creaCane(char* nome){
	Cane cane=(Cane)malloc(sizeof(struct cane));
	cane->nome = malloc(sizeof(char)*(strlen(nome)+1));
	strcpy(cane->nome,nome);
	return cane;
}

void distruggiCane(Cane cane){
	// cancello il nome
	free(cane->nome);
	// cancello tutta la struct
	free(cane);
}

void abbaia(Cane cane){
	printf("<%s>: BAU\n", cane->nome);
}

