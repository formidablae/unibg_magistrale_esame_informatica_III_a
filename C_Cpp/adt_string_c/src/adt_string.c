/*
 * adt_string.c
 *
 *  Created on: Oct 11, 2011
 *      Author: garganti
 */

#include "stdlib.h"
#include "adt_string.h"
#include <string.h>

struct StringStruct{
	int size; // size del buffer
	int length; // legth della string
	char* buffer; // caratteri (non zero terminated)
};
string mkString(char * s){
	// calcolo la lunghezza di s
	int l = strlen(s);
	string res = malloc(sizeof(struct StringStruct));
	res->length = l;
	res->size = l *2;
	res->buffer = malloc(sizeof(char)*l*2);
	// copio la stringa
	strcpy(s,res->buffer);
	return res;
}

char* asChars(string s){
	// TODO
	return s->buffer;
}

