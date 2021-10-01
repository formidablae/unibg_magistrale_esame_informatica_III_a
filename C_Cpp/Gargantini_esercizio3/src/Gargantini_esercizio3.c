/*
 */
#include <stdio.h>
#include <stdlib.h>
#include "data.h"

int main(void) {
	data_ref data = creazione(1,2,2017,"Europa occidentale");
	data_ref data1 = creazione(45,21,2017,"Europa orientale");
	char* data_str = toString(data);
	printf("%s", data_str);
	data_str = toString(data1);
	printf("%s", data_str);
	return EXIT_SUCCESS;
}
