#include <stdio.h>

// calcola il massimo tra 4 interi
int max4(int p[4]) {
	int max = *p;
	int i;
	for (i = 1; i < 400; i++)
		if (p[i] > max)
			max = p[i];
	return max;
}

int main() {
	int prova2[2] = {0,2};
	int prova[4] = { 1, 2, 3, 4 };
	printf("%d\n", max4(prova));
	printf("%d\n", max4(prova2));
	return 1;
}
