#include <stdio.h>
#include <stdlib.h>
#include "coppiaInt.h"
int main(void) {
	coppiaIntRef c1 = makeCoppiaInt(3, 5);
	printf("%s\n", toString(c1));
	coppiaIntRef c2 = makeCoppiaInt(6, 2);
	coppiaIntRef somma = sumCoppia(c1,c2);
	printf("%s + %s = %s\n", toString(c1), toString(c2), toString(somma));
	/*
	 *
	 *delete(c1);
	// dangling pointer --> NULL POINTER
	//c1 = NULL;*/
	delete(&c1);
	printf("%p",c1);
	//printf("%s",toString(c1));


	return EXIT_SUCCESS;
}
