/*
 ============================================================================
 Name        : te_gennaio13.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
/**
 * Scrivi una funzione in C che dato in ingresso una
 * stringa conta il numero di caratteri 'a' in essa.
 * Al solito, scrivi tre versioni: una non ricorsiva,
 * una ricorsiva senza tail recursion e una ricorsiva
 * con tail recursion.
 */
// s: puntatore alla stringa zero terminated
int contaA_I(char* s){
	int na = 0;
	while(*s >0){
		if (*s == 'a') na++;
		s++;
	}
	return na;
}
// funzione ricorsiva
// non tail call no tail recursion
int contaA_R(char* s){
	if (*s == 0) return 0;
	int na = contaA_R(s+1);
	if (*s == 'a') return 1 +na;
	else return na;
}
// atf : le a trovate fino ad ora
int contaA_TR(char* s, int atf){
	// se è finita ls stringa, non ne troverà piu
	if (*s == 0) return atf;
	// se a increment atf
	if (*s == 'a') return contaA_TR(s+1,atf+1);
	else return contaA_TR(s+1,atf);
}





int main(void) {
	char prova[] = "angelo";

	printf("%d\n", contaA_I(prova));
	printf("%d\n", contaA_R(prova));
	printf("%d\n", contaA_TR(prova,0));

	char prova2[] = "pietro";

	printf("%d\n", contaA_I(prova2));
	printf("%d\n", contaA_R(prova2));


	return EXIT_SUCCESS;
}
