/*
 ============================================================================
 Name        : dangling_free.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

// ESAME GENNAIO 2015
// Fa un esempio in C in cui hai un dangling pointer dovuto all'uso sbagliato di free. Costruisci uno
// scenario in cui riesci ad usarlo ugualmente e poi ti acorgi di qualche errore.

int main(void) {
	char* a=malloc(sizeof(char));
	*a='a';
	printf("valore iniziale di a %c\n",*a);//a contiene a
	free(a);//faccio la free del puntatore
	printf("valore di a immediatamente dopo free %c\n",*a);
	char* b=malloc(sizeof(char));//ora dichiaro un nuovo puntatore
	*b='b';
	printf("valore di b %c\n",*b);
	printf("valore di a dopo uso di b %c\n",*a); //adesso a punta a b !!
	return EXIT_SUCCESS;
}
