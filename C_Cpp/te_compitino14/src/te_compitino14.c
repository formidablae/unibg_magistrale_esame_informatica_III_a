/*
 ============================================================================
 Name        : te_compitino14.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

/* Scrivi una funzione strlun in C che dato in ingresso una
 * stringa (come array di char terminata da 0) restituisce
 * la sua lunghezza.
 * Al solito, scrivi tre versioni: una non ricorsiva,
 * una ricorsiva senza tail recursion e
 * una ricorsiva con tail recursion.
 * Specifica esattamente i parametri che passi alla procedura,
 * il tipo di passaggio utilizzato e il loro significato.
 * Definisci funzioni ausiliarie di aiuto se necessario,
 * per tenere la segnatura della funzione strlun più semplice.
 * Scrivi anche un main di esempio in cui chiami la funzione
 * con la string "ab" invocala in modo assegni il risultato
 * ad una variabile globale LUNG. Non usare alcuna
 * altra variabile globale.
 * Disegna il record di attivazione per tutte e
 * tre le versioni fino alla massima estensione del
 * record di attivazione. Nel caso di tail recursion,
 * spiega nel codice quali ottimizzazioni hai adottato o
 * potresti adottare.
 */

int LUNG;

int lunghI(char* s){
	int l = 0;
	for(; *(s+l) != 0; l++);
	return l;
}
int lunghR(char* s){
	if (*s == 0) return 0;
	return 1 + lunghR(s+1);
}
// s la stringa
// i posizione all'intero della stringa
int lunghTR(char* s, int i){
	if (s[i] == 0) return i;
	return lunghTR(s, i+1);
}


int main(void) {
	char s[30] = "ab";
	LUNG = lunghI(s);
	printf("%d\n",LUNG);
	LUNG = lunghR(s);
	printf("%d\n",LUNG);
	LUNG = lunghTR(s,0);
	printf("%d\n",LUNG);
	return EXIT_SUCCESS;
}
