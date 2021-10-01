/* prova di ricorsione del fattoriale */

#include <stdio.h>
#include <stdlib.h>

// fattoriale non ricorsivo
int fattNR(int n) {
	int res = 1;
	while (n >= 1) {
		res *= n--;
	}
	return res;
}
// fattoriale ricorsivo
int fattR(int n){
	if (n<=1) return 1;
	else return fattR(n-1) * n;
}
//int main(void) {
//	puts("!!!Hello World!!!"); /* prints !!!Hello World!!! */
//	return EXIT_SUCCESS;
//}
