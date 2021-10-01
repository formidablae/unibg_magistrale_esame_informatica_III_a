/*
 ============================================================================
 Name        : adt_studentcorso2.c
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

int main(void) {
	studenteRef s1 = mkStudente("matteo pasquale mario giovanni","verdi");
	printStudente(s1);
	//deleteStudente(&s1);
	studenteRef s2 = mkStudente("mario","bianchi");
	printStudente(s2);
	deleteStudente(&s2);
	corsoRef c = mkCorso("info 3");
	addStudent(c,s1);
	return EXIT_SUCCESS;
}
