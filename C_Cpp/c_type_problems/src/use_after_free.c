#include "stdio.h"
#include "stdlib.h"
#include <string.h>

/** uso un puntatore dopo il suo free */

int main(){
	char string[10] = "ciao";
	char* buf = (char*)malloc(100);
	strcpy(buf,string);
	printf("%s\n",buf);
	// free buf pointer
	free(buf);
	// buf diventa un dangling pointer
	printf("%s\n",buf);
	//
	buf[0] = 'y';
	buf[1] = '\0';
	printf("%s\n",buf);

}
