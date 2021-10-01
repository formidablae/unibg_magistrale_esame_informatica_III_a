#include <stdio.h>
#include <stdlib.h>

/*1 Funzione ricorsiva
 Si scriva una funzione massimo in C che prende un array X di interi e restituisce il massimo numero pari in X se esiste,
 altrimenti restituisce -1.

 Al solito, scrivi tre versioni: una iterativa non ricorsiva, una ricorsiva senza tail recursion e una ricorsiva con tail recursion.
 Specifica esattamente i parametri che passi alla procedura, il tipo di passaggio utilizzato e il loro significato con commenti prima della funzione.
 Scrivi anche un main di esempio in cui chiami la funzione massimo con diversi casi di test e lo stampa (cerca di coprire tutti i casi).
 */

/*
 * int* array (passaggio per puntatore ad int): puntatore al primo elemento dell'array
 * int len (passaggio per copia del valore): lunghezza dell'array
 */
int massimoIterativa(int* array, int len) {
	int tmpMax = -1;
	for (int i = 0; i < len; i++) {
		if (array[i] % 2 == 0 && (array[i] > tmpMax || tmpMax == -1)) {
			tmpMax = array[i];
		}
	}
	return tmpMax;
}

/*
 * int* array (passaggio per puntatore ad int): puntatore a un elemento dell'array (incrementato ad ogni chiamata ricorsiva)
 * int len (passaggio per copia del valore): lunghezza dell'array (decrementato ad ogni chiamata ricorsiva)
 */
int massimoRicorsivaNoTailRec(int* array, int len) {
	if (len == 0) {
		return -1;
	} else {
		int r = massimoRicorsivaNoTailRec(array + 1, len - 1);
		if (*array % 2 == 0 && (*array > r || r == -1)) {
			return *array;
		} else {
			return r;
		}
	}
}

/*
 * int* array (passaggio per puntatore ad int): puntatore a un elemento dell'array (incrementato ad ogni chiamata ricorsiva)
 * int len (passaggio per copia del valore): lunghezza dell'array (decrementato ad ogni chiamata ricorsiva)
 * int tmpMax (passaggio per copia del valore): massimo valore temporaneo trovato
 */
int massimoRicorsivaTailRec(int* array, int len, int tmpMax) {
	if (len == 0) {
		return tmpMax;
	} else {
		if (*array % 2 == 0 && (*array > tmpMax || tmpMax == -1)) {
			tmpMax = *array;
		}
		return massimoRicorsivaTailRec(array + 1, len - 1, tmpMax);
	}
}

int massimoRicorsivaTailRecWrapper(int* array, int len) {
	return massimoRicorsivaTailRec(array, len, -1);
}

int main() {

	int a[] = { 67, 12, 23, -6, 89, 1, 98, 3, 4, 99, 42, -2 }; //Array con valori sia pari che dispari
	int b[] = { }; //Array vuoto
	int c[] = { 5, 3, 9, 1, 97, 77 }; //Array con valori solo dispari
	int d[] = { -6, -3, 1}; //Array con valori anche pari ma minori di -1

	printf("Array a (pari e dispari)\n");
	printf("Iterativa: %d\n", massimoIterativa(a, 12));
	printf("Ricorsiva no tail recursion: %d\n",
			massimoRicorsivaNoTailRec(a, 12));
	printf("Ricorsiva tail recursion: %d\n",
			massimoRicorsivaTailRecWrapper(a, 12));

	printf("Array b (vuoto)\n");
	printf("Iterativa: %d\n", massimoIterativa(b, 0));
	printf("Ricorsiva no tail recursion: %d\n",
			massimoRicorsivaNoTailRec(b, 0));
	printf("Ricorsiva tail recursion: %d\n",
			massimoRicorsivaTailRecWrapper(b, 0));

	printf("Array c (solo dispari)\n");
	printf("Iterativa: %d\n", massimoIterativa(c, 6));
	printf("Ricorsiva no tail recursion: %d\n",
			massimoRicorsivaNoTailRec(c, 6));
	printf("Ricorsiva tail recursion: %d\n",
			massimoRicorsivaTailRecWrapper(c, 6));

	printf("Array d (<-1)\n");
	printf("Iterativa: %d\n", massimoIterativa(d, 3));
	printf("Ricorsiva no tail recursion: %d\n",
			massimoRicorsivaNoTailRec(d, 3));
	printf("Ricorsiva tail recursion: %d\n",
			massimoRicorsivaTailRecWrapper(d, 3));

	return 0;
}

