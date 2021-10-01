/*
 * listainteri.h
 *
 *  Created on: Oct 26, 2011
 *      Author: garganti
 */

#ifndef LISTAINTERI_H_
#define LISTAINTERI_H_

typedef struct ListaInteri * ListaInteriRef;

ListaInteriRef mkListaInteri();

// aggiunge x alla lista (in testa)
void add(ListaInteriRef lista, int x);

// print
void print(ListaInteriRef lista);
#endif /* LISTAINTERI_H_ */
