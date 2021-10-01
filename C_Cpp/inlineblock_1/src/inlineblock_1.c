/*
 * Esercizio 7.1
 * prima versione, completamente errata
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {

	printf("Prova RA inline block");
	int num, absVal;
	printf("Absolute Value\n");
	printf("Please enter a number:");
	scanf("%d", &num);
	if (num >= 0) {
		int absVal;
		absVal = num;
	} else {
		int absVal = -num;
	}
	printf("The absolute value of %d is %d.\n\n", num, absVal);
	return EXIT_SUCCESS;
}
