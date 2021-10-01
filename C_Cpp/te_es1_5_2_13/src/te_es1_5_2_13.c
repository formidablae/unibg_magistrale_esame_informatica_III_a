/*
 ============================================================================
 Name        : te_es1_5_2_13.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int COUNT = 0;

int conta_array(int A[], int x) {
	int cont = 0;
	int i;
	for (i = 0; i <= 4; i++) {
		if (A[i] >= x) {
			cont++;
		}
	}
	return cont;
}

// n: number of elements in A
int recursion(int A[], int n, int x) {
	if (n == 0) return 0;
	int res = recursion(A+1,n-1,x);
	if (*A >= x) return res +1;
	else return res;
}

int tail_recursion(int A[], int n, int x) {

	return 0;
}

int main() {
	int B[] = { 4, 6, 8, 9, 2 };
	COUNT = recursion(B,5,1);
	printf("%d\n",COUNT);
}

