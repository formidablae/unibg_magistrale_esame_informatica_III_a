
// Realizza una lista di N interi tramite tipi opachi
// la lista dovrà avere le seguenti operazioni
// - mkLista: costruisce una lista con al massimo N interi (N passato)
// inizialmente vuota
// - aggiungi: aggiunge un intero in fondo alla lista (se piena ignora)
// - toString: restituisce una stringa (char*) che rappresenta il
//    contenuto della lista


#include <stdio.h>
#include <stdlib.h>

int main(void) {
	ListIntRef l1 = mkList(100);
	// aggiungo
	aggiungi(l1,10);
	//...

	//
	// NON VA BENE free(l1);
	return EXIT_SUCCESS;
}
