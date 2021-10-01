/*
 * studente.h
 *
 *  Created on: Oct 26, 2011
 *      Author: garganti
 */

#ifndef STUDENTE_H_
#define STUDENTE_H_

typedef struct studente * studenteRef;

// costruttore
studenteRef mkStudente(char* n, char* g);
// print
void printStudente(studenteRef s);

void deleteStudente(studenteRef* s);

#endif /* STUDENTE_H_ */
