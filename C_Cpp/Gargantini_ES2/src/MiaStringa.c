/*
 * MiaStringa.c
 *
 *  Created on: 09/feb/2018
 *      Author: utente
 */


#include <stdio.h>
#include <stdlib.h>
#include "MiaStringa.h"
#include <string.h>



struct MiaStringa {
	char* s;

};

MiaStringaRef makeMiaStringa(char* st){
	MiaStringaRef nuovo=malloc(sizeof(struct MiaStringa));
	nuovo->s=malloc(sizeof(char)*strlen(st)+1);
	strcpy(nuovo->s,st);
	return nuovo;
}

void add(MiaStringaRef ms, char c){
	char* ausiliaria=malloc(sizeof(char)*(strlen(ms->s)+2));
	sprintf(ausiliaria,"%s%c",ms->s, c);
	free(ms->s);
	ms->s = ausiliaria;
}

char* toString(MiaStringaRef ms){
		return ms->s;
}
