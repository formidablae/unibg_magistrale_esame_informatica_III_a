/*
 ============================================================================
 Name        : invstring_esameset16.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

// palindrona recursion senza tail
// s: stringa e l:lunghezza
bool palindronaRNT(char* s, int l){
	if (l <=1) return true;
	return s[0] == s[l-1] && palindronaRNT(s+1, l-2);
}
// con tail
bool palindronaRNT(char* s, int l){
	if (l <=1) return true;
	if (s[0] != s[l-1]) return false;
	return palindronaRNT(s+1, l-2);
}


// inverti una stringa
// versione iterativa
// assumo che la stringa è null terminated
void inverStringI(char* s) {
	int i = 0; // inizio stringa
	int f = strlen(s) - 1; // indice dell'ultimo carattere
	while (i < f) {
		// scambio caratteri
		char temp = s[i];
		s[i] = s[f];
		s[f] = temp;
		i++;
		f--;
	}
}
void inverStringIPPPP(char* s) {
	char* f = s + (strlen(s) - 1); // indice dell'ultimo carattere
	while (s < f) {
		// scambio caratteri
		char temp = *s;
		*s = *f;
		*s = temp;
		s++; f--;
	}
}

//void inverStringRic(char* s) {
//}
// s la stringa d invertire ( o sottostringa, non terminata da 0)
// nc il numero di caratteri
void inverStringRic(char* s, int nc) {
	printf("indirizzo locale %d -- numero caratteri %d\n", s, nc);
	if (nc == 0 || nc == 1) return;
	char temp = s[0];
	printf("%d\n",&temp);
	s[0] = s[nc -1];
	s[nc-1] = temp;
	return inverStringRic(s+1, nc-2);
}


char inv[] = "abcd";

int main(void) {
	printf("%s -- indirizzo %d \n", inv, inv);
	//inverStringI(inv);
	//printf("%s\n", inv);
	//inverStringIPPPP(inv);
	inverStringRic(inv,4);
	printf("%s\n", inv);
	return EXIT_SUCCESS;
}
