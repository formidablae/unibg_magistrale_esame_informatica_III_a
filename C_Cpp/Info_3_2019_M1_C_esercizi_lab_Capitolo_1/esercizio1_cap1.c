#include <stdio.h>
#include <stdlib.h>

int HASHAB;

//calcolo di hash senza ricorsione
int hash(char *s) { //passaggio di s per indirizzo;
	int c = 0;
	for (int i = 0; s[i] != 0; i++)
		c += s[i] * (i + 1);
	return c;
}

//calcolo di hash con ricorsione
//s sempre per indirizzo. ho scelto di passare pos come parametro (per valore) per non complicare troppo le cose
int hashR_h(char *s, int pos) {
	if (*s == 0)
		return 0;
	else
		return (s[0] * pos) + hashR_h(++s, ++pos);
}
int hashR(char *s) {
	return hashR_h(s,1);
}



//calcolo di hash cion tail recursione
//s sempre per indirizzo, pos come prima, in piu viene aggiunto il paramtro h (accumulatore)
int hashTR_h(char *s, int pos, int h) {
// con passaggio per valore che contiene il valore dell'hash calcolato in modo incrementale ad ogni carattere
	if (*s == 0)
		return h;
	else {
		h += s[0] * pos;
		return hashTR_h(++s, ++pos, h);
	}
}

int hashTR(char *s){
	return hashTR_h(s,1,0);
}

int main(void) {
	char s[] = "ab";
	HASHAB = hash(s);
	printf("Il valore calcolato con hash è : %d", HASHAB);

	HASHAB = hashR(s);
	printf("\nIl valore calcolato con hashR è : %d", HASHAB);

	HASHAB = hashTR(s);
	printf("\nIl valore calcolato con hashTR è : %d", HASHAB);
	return EXIT_SUCCESS;
}
