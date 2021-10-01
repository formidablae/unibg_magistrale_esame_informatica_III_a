/*
 ============================================================================
 Name        : passarray14.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void stampa5n(int* array, int n){
	printf("sizeof in stampa %d\n", sizeof(array));
	for(int i = 0; i < n; i++){
		printf("%d\n",array[i]);
	}
}


void stampa5(int array[5000]){
	printf("sizeof in stampa %d\n", sizeof(array));
	for(int i = 0; i < 50; i++){
		printf("%d\n",array[i]);
	}
}

void stampa5p(int* array){
	printf("sizeof in stampa %d\n", sizeof(array));
	int i;
	for(i = 0; i < 5; i++, array ++){
		printf("%d ",*array);
	}
	printf("\n");
}

void lll5(int array[5]){
	for(int i = 0; i < 5; i++){
		array[i] = i *2;
	}
}


int main(void) {
	int a[] = {1,2,3,4,5};
	printf("size of in main %d\n", sizeof(a));
	stampa5n(a,5);
	return EXIT_SUCCESS;
}
