/*
 ============================================================================
 Name        : esercizio_palindroma.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// palindroma non ricorsiva
int palindromaNR(char* str){
	int length = strlen(str);
	int i;
	for(i = 0; i < length/2; i++){
		if (str[i] != str[length-i-1]) return 0;
	}
	return 1;
}

// palindroma  ricorsiva
int palindromaRT(char* str){
	printf("calcolo di palindroma per %s\n", str);
	int length = strlen(str);
	if (length == 0 || length ==1) return 1;
	if (str[0] != str[length-1]) return 0;
	char sottostringa[length-1];
	strcpy(sottostringa,str+1);
	sottostringa[length-2] = '\0';
	printf("sottostringa %s\n", sottostringa);
	return palindromaRT(sottostringa);
}


int main(void) {
	char* prova1 = "itopinonavevanonipoti";
	printf("%s è palindroma ? %d", prova1,palindromaNR(prova1));
	printf("\nxxxxx\n");
	printf("%s è palindroma ? %d", prova1,palindromaRT(prova1));
	return EXIT_SUCCESS;
}
