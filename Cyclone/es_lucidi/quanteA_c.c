#include <stdio.h>

int contaA(char ? s) {
	/*if (*s=='a') return 1 + contaA(s+1);
	else return contaA(s+1);*/
	return ((*s=='a')? 1 : 0) + contaA(s+1);
}

int main() {
	char s[5] = "ciao";
	int l = contaA(s);
	printf("le a sono %d\n", l);
	return 0;
}
