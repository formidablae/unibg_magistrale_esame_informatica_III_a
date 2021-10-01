/*
 ============================================================================
 Name        : TE_gen_10_es1.c
 Author      : Gargantini
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void stampaNR(char *s) {
	int l = strlen(s);
	int i = l - 1;
	for (; i >= 0; i--) {
		printf("%c", s[i]);
	}
	printf("\n");
}
void stampaR(char *s, int i) {
	if (i < 0){
		printf("\n");
		return;
	}
	/* else */
	printf("%c", s[i]);
	stampaR(s,i-1);

}

int main(void) {
	char* ciao = "ciao";
	// oppure ciao[5] = "ciao";
	stampaNR(ciao);
	stampaR(ciao,strlen(ciao)-1);
	return EXIT_SUCCESS;
}
