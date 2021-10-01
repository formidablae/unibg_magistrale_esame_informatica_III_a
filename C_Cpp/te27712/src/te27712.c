/*
 ============================================================================
 Name        : te27712.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int contaUniNR(int *x){
	// assumo *x > 0
	int result = 0;
	int y = *x;
	while(y >0){
		if (y%2 ==1) result++;
		y = y/2;
	}
	return result;
}
// qu: indica quanti uni abbiamo contato fina ad ora
// deve essere inizialmente zero
int contaUniTR(int* x, int qu){
	if (*x == 0 ) return qu;
	if (*x%2 == 1) qu ++;
	*x = *x/2;
	return contaUniTR(x,qu);
}

int res;

int main(void) {
	int u = 3;
	res=contaUniNR(&u);
	printf("result %d\n",res);
	res=contaUniTR(&u,0);
	printf("result %d\n",res);
	return EXIT_SUCCESS;
}
