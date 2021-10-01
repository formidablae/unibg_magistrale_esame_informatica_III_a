// tema d'esame di aprile 11,
// scrivi fibonacci
// F_n = F_n-1 + F_n-2
// F_0 = 0 e F_1 = 1

#include <stdio.h>
#include <stdlib.h>

// versione ricorsiva (con tail)
// assumo che n >= 0

int fibTr(int n, int r, int f_i1, int f_i2) {
	if (n == 1)
		return r;
	else {
		r = f_i1 + f_i2;
		return fibTr(n - 1, r, r, f_i1);
	}
}

// versione ricorsiva (senza tail)
// assumo che n >= 0
int fib(int n) {
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	// n > 1
	return fib(n - 1) + fib(n - 2);
}
// versione non ricorsiva, con ciclo for
int fibNr(int n) {
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	int fi2 = 0;
	int fi1 = 1;
	int fi;
	int i;
	for (i = 2; i <= n; i++) {
		fi = fi1 + fi2;
		fi2 = fi1;
		fi1 = fi;
	}
	return fi;
}

// versione non ricorsiva, con ciclo for
int fibW(int n) {
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	int fi2 = 0;
	int fi1 = 1;
	for(;;) {
		int fi = fi1 + fi2;
		if (n == 2) return fi;
		n --;
		fi2 = fi1;
		fi1 = fi;
	}
}


int main(void) {
	int FI_3 = fibW(3);
	printf(" numero di fibonacci fib(3) = %d\n", fib(3));
	printf(" numero di fibonacci fib(3) = %d\n", fibNr(3));
	printf(" numero di fibonacci fib(3) = %d\n", fibTr(3,0,1,0));
	printf(" numero di fibonacci fib(3) = %d\n", fibW(3));
	return EXIT_SUCCESS;
}
