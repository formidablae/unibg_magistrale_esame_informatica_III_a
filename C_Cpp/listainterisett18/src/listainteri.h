/*
 * listainteri.h
 *
 *  Created on: 16 ott 2018
 *      Author: garganti
 */

#ifndef LISTAINTERI_H_
#define LISTAINTERI_H_

typedef struct listainteri * listaref;

listaref makeListaInteri(int MAX);// MAX elementi nella lista
void add(listaref,int); // aggiunge alla lista
//...
char* toString(listaref);

#endif /* LISTAINTERI_H_ */
