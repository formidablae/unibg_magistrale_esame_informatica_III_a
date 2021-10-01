/*
 * Cane.h
 *
 *  Created on: 20/gen/2015
 *      Author: utente
 */


#ifndef CANE_H_
#define CANE_H_


typedef struct cane* Cane;

// costruttore
Cane creaCane(char* nome);
// distruttore
void distruggiCane(Cane cane);
// abbaia
void abbaia(Cane cane);

#endif /* CANE_H_ */
