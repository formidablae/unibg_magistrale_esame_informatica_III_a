/*
 * ListaInt.h
 *
 *  Created on: 23 ott 2019
 *      Author: garganti
 */

#ifndef LISTAINT_H_
#define LISTAINT_H_

typedef struct ListInt* ListIntRef;

ListIntRef mkList(int N);

void aggiungi(ListIntRef, int i);

char* toString(ListIntRef);

// distruttore
void freeListInt(ListIntRef);


#endif /* LISTAINT_H_ */
