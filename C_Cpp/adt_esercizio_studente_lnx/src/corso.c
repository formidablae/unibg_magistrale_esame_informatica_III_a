/*
 * corso.c
 *
 *  Created on: Oct 19, 2011
 *      Author: garganti
 */

#include "corso.h"
#include <stdlib.h>
#include <string.h>
#define CORSO_NAME 3

struct corso{
	char name[3000];
	int numStudents;
	studenteRef students[100];
};

corsoRef mkCorso(char *n){
	corsoRef c = malloc(sizeof(struct corso));
	//strncpy(c->name,n,100);
	c->numStudents = 0;
	strcpy(c->name,n);
	return c;
}

void printCorso(corsoRef cr){
	printf("%s  studenti: %d\n", cr->name, cr->numStudents);
	int i;
	for(i = 0; i < cr->numStudents; i++){
		printStudente(cr->students[i]);
	}
}

void addStudent(corsoRef c, studenteRef s){

}


// cerca un ostudente per matricola in un corso
studenteRef cercaStudente(corsoRef c, int matricola){
	return NULL;
}
