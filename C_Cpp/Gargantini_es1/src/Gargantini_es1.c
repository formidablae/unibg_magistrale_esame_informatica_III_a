/*
 Scrivi una funzione togliA in C che dato in ingresso una stringa restituisce una stringa uguale tranne che toglie le a se ci sono.
 Al solito, scrivi tre versioni: una non ricorsiva, una ricorsiva senza tail recursion e una ricorsiva con tail recursion.
 Specifica esattamente i parametri che passi alla procedura, il tipo di passaggio utilizzato e il loro significato.
 Scrivi anche un main di esempio in cui chiami la funzione con qualche string di esempio e stampi il risultato.
 Non usare alcuna altra variabile globale.
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// funzione iterativa
char* togliA(char* s) {
	char* s2 = (char*) malloc(sizeof(char) * (strlen(s) + 1));
	int i = 0;
	while (*s) {
		if (*s != 'a') {
			s2[i] = *s;
			i++; //se abbiamo inserito una lettera in s2, per la prossima lettera devo incrementare i
		}
		s++;
	}
	return s2;
}

// versione senza tail recursion
//
char* togliARicorsivaNoTail(char* s) {
	if (!*s) {
		// return empty string
		char* temp = calloc(1, sizeof(char));
		return temp;
	} else {
		// recursive call
		char* temp = togliARicorsivaNoTail(s + 1);
		if (*s == 'a') {
			return temp;
		} else {
			char * finale = malloc(sizeof(char) * (strlen(s) + 1));
			sprintf(finale, "%c%s", *s, temp);
			free(temp);
			return finale;
		}
	}

}

//i viene usato con lo stesso obiettivo della funzione iterativa
char* togliARicorsivaTail(char* s, char* dest, int i) {
	if (!*s)
		return dest;
	else {
		if (*s != 'a') {
			dest[i] = *s;
			return togliARicorsivaTail(s + 1, dest, i + 1);
		} else
			return togliARicorsivaTail(s + 1, dest, i);
	}

}

int main(void) {
	//specificare parametri passati
	char* prova = "lllaaaoooaakk";
	printf("INIZIALE: %s \n", prova);
	// NON RICORSIVA
	printf("NON RICORSIVA: %s \n", togliA(prova)); //passo l'indirizzo puntato da prova. Passaggio per valore del puntatore
	// NO TAIL
	printf("RICORSIVA no tail: %s \n", togliARicorsivaNoTail(prova)); //passo gli indirizzi puntati. Passaggio per valore dei
	// TAIL
	char* destinazione = (char*) malloc(sizeof(char) * (strlen(prova) + 1));
	printf("RICORSIVA tail: %s \n", togliARicorsivaTail(prova, destinazione, 0));
	return EXIT_SUCCESS;
}

