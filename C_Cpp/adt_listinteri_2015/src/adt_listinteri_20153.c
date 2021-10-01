/*
 ============================================================================
 Name        : adt_listinteri_20153.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
/* Scrivi la definizione di un tipo di dato astratto ListN che rappresenta una sequenza
 *  di N numeri interi (int).
 Per implementarla utilizza gli array.
 Scrivi le seguenti funzioni:
 - makeListN(int n) che costruisce una lista di N numeri ListN  e la restuitisce
 - set(i,j) che setta l'i-esima posizone a j (non fa nulla se i è fuori lista)
 - get(i) che restituisce l'i-esemo valore (o 9999 se non esiste tale posizione)
 - deleteListN che distrugge (il contenuto) della ListaN
 Scrivi un main in cui fai alcune prove
 */
#include "listainterin.h"

int main(void) {

	ListaInteriN l = makeListaInteriN(10);
	// setto la prima posizone
	set(l,0,10);
	// ristanpo il valore alla prima posizione
	printf("%d", get(l,0));
	// cancello la mia lista dalla memoria
	deleteListN(l);
	return EXIT_SUCCESS;
}
