/*
 * esercizio.c
 *
 *  Created on: 28/set/2010
 *      Author: garganti
 *
 *      Record di attivazione
 Scrivi una funzione in C che dato in ingresso un array di int restituisce il numero minore.
 Scrivi tre versioni: una non ricorsiva, una ricorsiva senza tail recursion e una ricorsiva con tail recursion.
 Specifica esattamente i parametri che passi alla procedura, il tipo di passaggio utilizzato e il loro significato.
 Descrivi anche le assunzioni che fai (ad esempio zero terminated o cose simili).
 Scrivi anche un main di esempio in cui chiami le funzioni con un array di tua scelta con 2 elementi.
 L'array deve essere dichiarato come variabile nel main.
 La variabile locale MIN a cui assegnare nel main il risultato della funzione di cui sopra deve essere globale. Non usare altre variabili globali.

 Disegna il record di attivazione per tutte e tre le versioni fino alla
 massima estensione del record di attivazione.
 Nel caso di tail recursion, spiega quali ottimizzazioni hai adottato o potresti adottare.

*/

#include <stdio.h>
#include <stdlib.h>
// array è l'array in cui cercare il minimo (array NON è zero terminated)
// n è il numero di elementi dell'array
int searchMin(int array[], int n){
	int min =  array[0];
	int index = 1;
	while(index < n){
		if (array[index] < min)
			min = array[index];
		index++;
	}
	return min;
}
// versione ricorsiva senza tail
// array è il puntatore all'array, n la dimensione
int searchMinNTRec(int array[], int n){
	// se n  = 1, l'array ha solo un elemento
	if (n == 1) return array[0]; // *array
	// altrimenti ci sono diversi elementi ancora
	int min = searchMinNTRec(array +1, n -1);
	if (min < array [0]) return min;
	else return array[0];
}
// versione ricorsiva con tail
// array è il puntatore all'array, n la dimensione
// minTemp per memorizzare il valore minimo fino a quelo momento
int searchMinTail(int array[], int n, int minTemp){
	if (n == 1) return array[0]; // *array
	if (array[0] < minTemp) minTemp = array[0];
	return searchMinTail(array +1, n -1, minTemp);
}


int MIN;

int main(void){
	int prova[] = {-7,-6};
	MIN = searchMin(prova,2);
	printf("Minimo %d\n",MIN);
	// versione ricorsiva
	MIN = searchMinNTRec(prova,2);
	printf("Minimo %d\n",MIN);
	MIN = searchMinTail(prova,2,prova[0]);
	printf("Minimo %d\n",MIN);
	return EXIT_SUCCESS;
}
