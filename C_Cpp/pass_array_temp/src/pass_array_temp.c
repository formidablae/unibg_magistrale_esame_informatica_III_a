/*
 ============================================================================
 Name        : pass_array_temp.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

//int foo(int a[5]){
//int foo(int* a){
int foo(int a[]){
	printf("sizeof a %d \n",sizeof(a));
	int max = a[0];
	//int i;
	for(int i = 1; i < 5; i++){
		if (a[i]> max){
			max = a[i];
		}
	}
	return max;
}

// aggiungo dimensione
int fooN(int* a, int n){
	printf("sizeof a %d \n",sizeof(a));
	int max = a[0];
	//int i;
	for(int i = 1; i < n; i++){
		if (a[i]> max){
			max = a[i];
		}
	}
	return max;
}

char maxChar(char* s){
	char max = 0;
	while(*s){
		printf("s: %p \n",s);
		if ((*s) > max) {
			max = *s;
			*s = 'K';
		}
		s++;
	}
	return max;
}


int main(void) {
	int p[5] = {1,2,3,4,5};
	int m = foo(p);
	//int m = fooN(p,5);
	/*int m = fooN(p,sizeof(p)/sizeof(int));
	printf("sizeof p %d \n",sizeof(p));
	printf("%d \n",m);*/
	/* */
	/*char stringa[] = {'p','i',0};
	/*char stringa[] = {'p','i','\0'};
	/*char stringa[] = "pippoz";*/
	int y = 90;
	char stringa[] = {'p','i'};

	printf("stringa pointer: %p \n",stringa);

	printf("stringa: %s \n",stringa);

	printf("%c \n",maxChar(stringa));

	printf("stringa: %s \n",stringa);


	return EXIT_SUCCESS;
}
