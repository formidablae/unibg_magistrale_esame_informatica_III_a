/*
 ============================================================================
 Name        : provaScopeLifetime.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int y;
	int z;
	y = 90;
	{
		int w;
		y = 0;
		{
			int y;
			y = 5;
			printf("%d",y);
		}
	}
	int u = 9;
	printf("%d",y);
	return EXIT_SUCCESS;
}
