/*
 ============================================================================
 Name        : esercizi_lab_ott12.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

void f(){
  printf("ciao\n");
}
void g(){
	int y;
	printf("%p\n",&y);
}


int main(void){
	printf("%p\n",&f);
	g();
	return EXIT_SUCCESS;
}
