/*
 ============================================================================
 Name        : inlineblock_2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int num;
	printf("Absolute Value\n");
	printf("Please enter a number:");
	scanf("%d", &num);
	if (num >= 0) {
		int absVal = num;
		printf("value %d", absVal);
	} else {
		int absVal = -num;
		printf("value %d", absVal);
	}
	{
		int absVal;
		printf("The absolute value of ");
		printf("%d is %d.\n\n", num, absVal);
	}
	return EXIT_SUCCESS;
}
