/** dato un array di interi
 * calcola la somma
 */
#include <stdio.h>
#include <stdlib.h>

int somma(int array[], int dim) {
	int result = 0;
	int i;
	for (i = 0; i < dim; i++) {
		result += array[i];
	}
	return result;
}

// versione ricorsiva non tail
int sommaR(int array[], int dim) {
	if (dim == 0)
		return 0;
	else
		return sommaR(array + 1, dim - 1) + array[0];
}
// con tail recursion
int sommaTR(int array[], int dim, int sommapar) {
	if (dim == 0)
		return 0;
	else
		return sommaTR(array + 1, dim - 1, sommapar + array[0]);
}

// con tail recursion dal fondo dell'array
int sommaTR2(int array[], int dim, int sommapar) {
	if (dim == 0)
		return sommapar;
	else {
		// somma l'ultimo elemento nell'array da considerare
		sommapar += array[dim - 1];
		return sommaTR2(array, dim - 1, sommapar);
	}
}

int main(void) {

	int dieci[3];
	int n = sizeof(dieci) / sizeof(int);
	sommaTR(dieci,n,0);

	printf("numero elementi %d\n", n);
	int i;
	for (i = 0; i < n; i++) {
		dieci[i] = i;
	}

	printf("la somma è %d", somma(dieci, n));

	printf("la somma ricorsiva è %d", sommaR(dieci, n));
	return EXIT_SUCCESS;
}
