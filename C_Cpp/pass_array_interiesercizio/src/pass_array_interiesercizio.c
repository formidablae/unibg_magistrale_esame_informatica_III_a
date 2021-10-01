/*
 ============================================================================
 Name        : pass_array_interiesercizio.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

//float media(int voti[3]){
//float media(int voti[]){
float media(int* voti){

	printf("proc: sizeoof array %d",sizeof(voti)/sizeof(int));
	return (voti[0] + voti[1] + voti[2])/3.0;
}

int main(void) {
	int voti[3];
	voti[0] = 30;
	voti[1] = 30;
	voti[2] = 30;
	printf("sizeoof array %d",sizeof(voti)/sizeof(int));
	printf("media %f",media(voti));
	return EXIT_SUCCESS;
}
