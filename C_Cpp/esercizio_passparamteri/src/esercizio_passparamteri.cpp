/** esercizio sui passaggi parametri
 * calcolo del quadrato
 */
#include <iostream>
using namespace std;

// quadrato per valore
float quadV(float x) {
	//float res;
	x = x * x;
	return x;
}

// quadrato per ref
float quadR(float& x){
	float res;
	res = x * x;
	return res;
//	x = x *x ;
//	return x;
}
// quadrato per puntatore
float quadP(float* px){
	float res;
	res = (*px) * (*px) ;
	return res;
}

int main() {
	float y = 9;
	cout << "per valore " << quadV(y) << endl;
	cout << "per riferimento " << quadR(y)
			<< " e il quadrato di " << y <<endl;
	cout << "per puntatore " << quadP(&y) << endl;

	return 0;
}
