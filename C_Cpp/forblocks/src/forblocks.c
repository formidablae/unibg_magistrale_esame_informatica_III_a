/*
fa vedere il blocco di attivazione per i diversi blocchi inline
 */

#include <stdio.h>
#include <stdlib.h>

int a;

int main(void) {
	int i;
	a = 6;
	for (i = 0; i < 3 ; i++){
		printf("valore di i %d \n",i);
		int z = 0;
		for (z = 0; z < 3 ; z++){
			printf("valore di z %d \n",z);
			int x = z + i;
			printf("valore di x %d \n",x);
		}

	}
	return EXIT_SUCCESS;
}
