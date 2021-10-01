/*
 * studente.h
 *
 *  Created on: Oct 19, 2011
 *      Author: garganti
 */

#ifndef STUDENTE_H_
#define STUDENTE_H_

typedef struct studente * studenteRef;

// make
studenteRef mkStudente(char * n, char * c);

// print
void printStudente(studenteRef s);

// get la matricola
int getMatricola(studenteRef s);

// delete the student and free the memory
void deleteStudente(studenteRef* s);

#endif /* STUDENTE_H_ */
