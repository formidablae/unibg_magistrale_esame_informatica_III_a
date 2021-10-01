/*
 * search.c
 *
 *  Created on: 07 ott 2015
 *      Author: garganti
 */

// cerca x in a di lunghezza n e restuisce de c'è
int search(int x, int* a, int n) {
	// se array è vuoto
	if (n == 0)
		return 0;
	// se x è in prima posizione
	if (a[0] == x)
		return 1;
	// altrimenti cerca in avanti
	return search(x, a + 1, n - 1);
}

int main() {
	int b[] = { 1, 2,3};
	printf("%d\n", search(1,b,3));
	printf("%d\n", search(10,b,3));

}
