/* funzione che calcola il carattere maggiore in una string*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


//char massimo(char* str) {
char massimo(char str[]) {
	char max = 0;
	while (*str != '\0') {
		if (*str > max)
			max = *str;
		str++;
	}
	return max;
}

int main(void) {
	char pp1[5] = "zzzzz";
	char pp[6] = "ooooo";
	char pp2[5] = "zzzzz";
	pp[5] = 'o';
	printf("%s\n",pp);
	//scanf("%s",pp);
	printf("max è %c",massimo(pp));
	return EXIT_SUCCESS;
}
