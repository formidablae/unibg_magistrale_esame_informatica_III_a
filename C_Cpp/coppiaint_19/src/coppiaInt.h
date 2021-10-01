/*
 * 3 Tipi opachi in C
Scrivi la definizione di un tipo di dato astratto CoppiaInt che rappresenta una coppia di interi. Scrivi le seguenti funzioni:
- makeCoppiaInt che prende in ingresso due interi e costruisce la coppia.
- sumCoppia che prende in ingresso due coppie e restituisce la coppia con la somma dei due numeri nelle due coppie passate in ordine.
- toString che restituisce una stringa classica char* contenente la coppia nel formato <n1,n2>
- delete che distrugge la copia.
Scrivi un main in cui fai alcune prove.
 */

#ifndef COPPIAINT_H_
#define COPPIAINT_H_

typedef struct coppiaInt* coppiaIntRef;

coppiaIntRef makeCoppiaInt(int a, int b);

coppiaIntRef sumCoppia(coppiaIntRef, coppiaIntRef);

char * toString(coppiaIntRef);

// puntatore a puntatore opaco
void delete(coppiaIntRef*);

#endif /* COPPIAINT_H_ */
