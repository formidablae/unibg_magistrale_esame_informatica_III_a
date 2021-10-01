#include <stdio.h>

int mystrlen(const char *s) {
	if (!s)
		return 0;
	int i;
	for (i = 0; s[i] != 0; i++)
		;
	return i;
}

int main() {
	int l;
	char s[10] = "pippo";
	l = mystrlen(s);
	printf("la stringa %s lunga %d\n", s, l);
	char s2[3];
	s2[0] = 'A';
	s2[1] = 'B';
	s2[2] = 'C';
	l = mystrlen(s2);
	printf("la stringa %s lunga %d\n", s2, l);
}
