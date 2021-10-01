/*
 ============================================================================
 Name        : adt_esercizio_lnx.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "studente.h"
#include "corso.h"

void prova(void){
	studenteRef giovanni = mkStudente("giovanni","rossi");
	printStudente(giovanni);
	studenteRef giovanni2 = mkStudente("giovanni","verdi");
	printStudente(giovanni2);
	corsoRef info3 = mkCorso("info3 ddsd  dff edf");
	printCorso(info3);
	addStudent(info3,giovanni);
    studenteRef s2= cercaStudente(info3,getMatricola(giovanni));
    if (s2 != NULL) printStudente(s2);
    else printf(" non trovato");
    // delete pointer
    deleteStudente(&giovanni);
    deleteStudente(&giovanni2);
	return;
}

int main(void) {
	prova();
	return EXIT_SUCCESS;
}
