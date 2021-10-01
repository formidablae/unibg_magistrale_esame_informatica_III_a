/*
 ============================================================================
 Name        : esercizio_13_9_25.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>



// A è passato come array (puntatore)
// length: numeri in A
// x (elemento da cercare) come puntatore
//bool cercaInArrayI(int A[N], int* x) NOOOOO
// zero terminated NOOO
//
// bool cercaInArrayI(int* A, int length, int* x) OK
bool cercaInArrayI(int A[], int length, int* x){
	for(int i = 0 ; i < length; i++){
		if (*(A+i)==*x) return true;
	}
	return false;
}

//RICORSIVA
bool cercaInArrayTR(int A[], int length, int* x){
	if (length <= 0) return false;
	if (*A == *x) return true;
	return cercaInArrayTR(A+1, length-1, x);
}

bool cercaInArrayR(int A[], int length, int* x){
	if (length <= 0) return false;
	return (*A == *x) || cercaInArrayR(A+1, length-1, x);
}

bool COUNT;

int main(void) {
	int v[] = {1,2};
	int y = 3;
	COUNT = cercaInArrayI(v,2,&y);
	printf("%d\n",COUNT);
	COUNT = cercaInArrayR(v,2,&y);
	printf("%d\n",COUNT);
	COUNT = cercaInArrayTR(v,2,&y);
	printf("%d\n",COUNT);
	return EXIT_SUCCESS;
}
