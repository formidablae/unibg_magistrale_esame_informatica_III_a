#include <stdio.h>
#include <stdlib.h>

/* restituisce il max in un array di caratteri
 *
 * p: array di dimensione n
 */
int getMax(int * p, int n) {
	int max = *p;
	int i = 0;
	while (i < n) {
		if (p[i] > max)	max = *(p + i);
		i++;
	}
	return max;
}

int main(void) {
	int a[4] = {1,2,3,4};
	printf("max %d", getMax(a,sizeof(a)/sizeof(int)));
	printf("max %d", getMax(a,4));
	printf("max %d", getMax(a,50));
	return EXIT_SUCCESS;
}
