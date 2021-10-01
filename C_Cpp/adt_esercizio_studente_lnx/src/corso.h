/*
 * corso.h
 *
 *  Created on: Oct 19, 2011
 *      Author: garganti
 */

#ifndef CORSO_H_
#define CORSO_H_
#include "studente.h"

typedef struct corso* corsoRef;

corsoRef mkCorso(char * n);

void addStudent(corsoRef c, studenteRef s);

// cerca un ostudente per matricola in un corso
studenteRef cercaStudente(corsoRef c, int matricola);

// stampa i dati del corso
void printCorso(corsoRef cr);

#endif /* CORSO_H_ */
