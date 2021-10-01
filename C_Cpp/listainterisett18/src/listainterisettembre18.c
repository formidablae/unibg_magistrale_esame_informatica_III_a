/*
 4 Lista interi
 Scrivi la definizione di un tipo di dato astratto ListaInteri che rappresenta una lista di interi  (max N intero passato nel costruttore) mediante i tipi opachi. Usa un array o buffer come struttura dati sottostante. Scrivi le seguenti funzioni:
 - makeList che costruisce una lista vuota con al massimo N interi passato come argomento
 - add che aggiunge l’intero passato come argomento alla lista in fondo (solo se c'è spazio, altrimenti non fa nulla)
 - del che rimuove il primo intero della lista (se c’è, altrimenti non fa nulla)
 - toString che restituisce una stringa contenente i numeri della lista.
 Scrivi un main in cui fai alcune prove*/

#include <stdio.h>
#include <stdlib.h>
#include "listainteri.h"
int main(void) {
	listaref l1 = makeListaInteri(100);
	add(l1,12);
	printf("%s\n",toString(l1));
	add(l1,20);
	printf("%s\n",toString(l1));
	return EXIT_SUCCESS;
}
