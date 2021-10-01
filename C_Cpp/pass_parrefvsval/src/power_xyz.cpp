#include <cstdlib>
#include <iostream>

using namespace std;

/* valore calcolato x ^ y in z
 * proviamo tutti i passaggi
 * passaggio per ref per z, obbligato
 */
void power(int x, int y, int& z) {
	z = 1;
	while (y > 0) {
		z = z * x;
		y--;
	}
}

int main(int argc, char *argv[]) {
	int res;
	int a = 2;
	int b = 3;
	power(a, b, res);
	cout << "2^3 " << res << endl;
	cout << "a " << a << endl;
	cout << "b " << b << endl;
	// 3 ^3
	/*int u = 3;
	 power(u, u, res);
	 cout << "3^3 " << res << endl;*/
	return EXIT_SUCCESS;
}
