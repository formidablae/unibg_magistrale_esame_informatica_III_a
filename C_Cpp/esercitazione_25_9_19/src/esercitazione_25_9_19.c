/*
 ============================================================================
 Name        : esercitazione_25_9_19.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
// iterativa
int hash_I(char *s) {
	int hash = 0;
	for (int i = 0; s[i] != '\0'; i++) {
		hash += s[i] * (i + 1);
	}
	return hash;
}
// cambiamo la segnatura
// s -> stringa
// w -> peso del primo carattere in s
// ricorsvia non TAIL
int hash_R_h(char *s, int w) {
	if (*s == '\0')
		return 0;
	return (*s) * w + hash_R_h(s + 1, w + 1);
}
int hash_R(char *s) {
	return hash_R_h(s, 1);
}
// --> tail recursion:
// s --> stringa
// w --> peso del primo carattere in s
// h -> hash calcolata fino ad ora
int hash_TR_h(char *s, int w, int h) {
	if (*s == '\0')
		return h;
	return hash_TR_h(s + 1, w + 1, h + (*s) * w);
}
int hash_TR(char *s) {
	return hash_TR_h(s, 1, 0);
}

// somma dei numeri pari
int sommaPari_I(int a[], int n) {
	int res = 0;
	for (int i = 0; i < n; i++) {
		if (a[i] % 2 == 0)
			res += a[i];
	}
	return res;
}



int sommaPari_R(int a[], int n) {
	// base delle ricorsione
	if (n == 0)
		return 0;
	// chiamata ricorsiva
	int res = sommaPari_R(a + 1, n - 1);
	return res + ((a[0] % 2 == 0) ? *a : 0);
}

int sommaPari_TR(int a[], int n, int somma) {
	// base delle ricorsione
	if (n == 0)
		return somma;
	// chiamata ricorsiva
	if (a[0]%2 == 0)
		return sommaPari_TR(a + 1, n - 1, somma + *a);
	else
		return sommaPari_TR(a + 1, n - 1, somma);
}

int sommaPari_TR2(int a[], int n){
	return sommaPari_TR(a, n, 0);
}


int main(void) {
	int p[] = { 10, 5, 6 };
	char a[] = "anna";
	printf("hash: %d\n", hash_I(a));
	printf("hash: %d\n", hash_R(a));
	printf("%d\n", sommaPari_I(p, sizeof(p) / sizeof(int)));
	printf("%d\n", sommaPari_R(p, sizeof(p) / sizeof(int)));
	return EXIT_SUCCESS;
}
