/*
 * listainteri.c
 *
 *  Created on: 16 ott 2018
 *      Author: garganti
 */
#include "listainteri.h"

typedef struct listainteri {
	int N; // numero massimo di elementi (stabilito dall'utente)
	int* data; // buffer contenente i dati (N interi)
	int m; // quanti dati ci sono effettivamente
}* listaref;

listaref makeListaInteri(int MAX) {
	listaref res = malloc(sizeof(struct listainteri));
	res->N = MAX;
	res->data = malloc(sizeof(int) * MAX);
	res->m = 0;
	return res;
}
void add(listaref l, int i) {
	// aggiunge alla lista
	// lista piena?
	if (l->m == l->N)
		return;
	// altrimenti
	l->data[l->m++] = i;
}
//...
char* toString(listaref l) {
	// assumiamo ogni cifra 5 caratter
	char* res = malloc(sizeof(char) * 5 * l->m);
	//res[0] = 0;
	for (int i = 0; i < l->m; i++) {
		if (i==0)
			sprintf(res, "%d", l->data[i]);
		else
		sprintf(res, "%s, %d", res, l->data[i]);
	}
	return res;
}
