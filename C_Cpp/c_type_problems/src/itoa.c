#include "stdio.h"
/** converte un intero in stringa corrispondente*/
char * itoa(int i) {
	char buf[20];
	sprintf(buf, "%d", i);
	return buf;
}

int main() {
	int u = 1;
	char* l = itoa(u);
	printf("%d vale %s\n", u, l);
}
