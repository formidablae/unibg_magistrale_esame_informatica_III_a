#include "coppiaInt.h"
#include <stdlib.h>

struct coppiaInt{
	// prima soluzione int n1,n2; --> consigliata
	// un po' più complicata: un buffer di due int
	int* data;
};

coppiaIntRef makeCoppiaInt(int a, int b){
	// 1. costruiscio la struct
	coppiaIntRef nc = malloc(sizeof(struct coppiaInt));
	// costruisco i data
	nc->data = malloc(sizeof(int)*2);
	// setto i valori
	nc->data[0] = a;
	nc->data[1] = b;
	return nc;
}

coppiaIntRef sumCoppia(coppiaIntRef c1, coppiaIntRef c2){
	return makeCoppiaInt(c1->data[0] + c2->data[0],
			c1->data[1] + c2->data[1]);

}

char * toString(coppiaIntRef c){
	// creo il buffer per 20 caratteri
	char* buffer = malloc(20* sizeof(char));
	sprintf(buffer,"<%d,%d>",c->data[0], c->data[1]);
	return buffer;
}

void delete(coppiaIntRef* c){
	free((*c)->data);
	free(*c);
	*c = NULL;
}

