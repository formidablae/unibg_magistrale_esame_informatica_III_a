/* 3 Tipo opaco per Data
 Si vuole realizzare una struttura dati per memorizzare una data composta da tre interi giorno, mese e anno e da una stringa di lunghezza variabile che rappresenta il fuso (es. “europa occidentale”).
 I metodi che la libreria mette a disposizione sono:
 • creazione di una data passati tre interi (giorno, mese, anno) e la stringa per il fuso. Se non sono validi (giorni o mesi non possibile), li mette a 1.
 • toString che restituisce una stringa (char*) contenente la data in formato “GG-MM-YY - fuso”. Usa la funzione sprintf.
 • distruzione: fa il free della data
 Scrivi l’orario usando i puntatori opachi in C. Fai un esempio ben commentato in cui utilizzi tutti i metodi sopra.
*/

typedef struct data* data_ref;

data_ref creazione(int,int,int,char*);

char* toString(data_ref);

void distruzione(data_ref*);
