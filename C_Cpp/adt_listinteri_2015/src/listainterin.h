/*
 * listainterin.h
 *
 *  Created on: 25 nov 2015
 *      Author: garganti
 */

#ifndef LISTAINTERIN_H_
#define LISTAINTERIN_H_

typedef struct listarecord * ListaInteriN;

ListaInteriN makeListaInteriN(int n);

void set(ListaInteriN,int i,int j);

int get(ListaInteriN,int i);

void deleteListN(ListaInteriN);

#endif /* LISTAINTERIN_H_ */
