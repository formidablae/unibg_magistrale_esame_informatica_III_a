/** dato un array di interi
 * calcola la somma
 */
#include <stdio.h>
#include <stdlib.h>

int somma(int *array, int dim) {
	int result = 0;
	int i;
	for (i = 0; i < dim; i++) {
		if (array[i]%2==0){
			result += array[i];
		}
	}
	return result;
}

// versione ricorsiva non tail
int sommaR(int *array, int dim) {
	int current=0;
	if (dim == 0)
		return 0;
	else
		if (*array % 2 == 0)
			current = *array;
	return sommaR(++array, dim - 1) + current;
}

// con tail recursion
int sommaTR(int *array, int dim, int sommapar) {
	int current=0;
	if (dim == 0)
		return sommapar;
	else
		if (*array % 2 == 0)
				current = *array;
	return sommaTR(++array, dim - 1, sommapar + current);
}


int main(void) {

	int dieci[]={1,5,3,2,7,10};
	int n = sizeof(dieci) / sizeof(int);
	//sommaTR(dieci,n,0);

	printf("la somma è %d", somma(dieci,n));

	printf("\nla somma ricorsiva è %d", sommaR(dieci, n));
	printf("\nla somma tail rec è %d", sommaTR(dieci, n, 0));
	return EXIT_SUCCESS;
}

/* Alternativa: uso un array di char. Nel ciclo for uso la condizione *array!='\0' 
e poi quando devo trasformare il char in int uso 'atoi(char)'
*/
