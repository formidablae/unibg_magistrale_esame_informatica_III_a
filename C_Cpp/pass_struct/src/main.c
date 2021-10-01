/*
 * main.c
 *
 *  Created on: 14/ott/2014
 *      Author: garganti
 */
#include <stdio.h>
#include <stdlib.h>

struct persona{
	char nome[30];
	char cognome[30];
};

void setMyNameW(struct persona p){
	strcpy(p.nome, "angelo");
	strcpy(p.cognome, "gargantini");
	printf("io sono %s %s\n", p.nome, p.cognome);
}

void setMyName(struct persona* p){
	strcpy(p->nome, "angelo");
	strcpy(p->cognome, "gargantini");
	printf("io sono %s %s\n", p->nome, p->cognome);
}


int main(int argc, char **argv) {
	struct persona ag;
	setMyName(&ag);
	printf("io sono %s %s", ag.nome, ag.cognome);
}
