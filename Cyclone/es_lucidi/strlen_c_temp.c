#include <stdio.h>

int strlen(int* c){
	int i = 0;
//	while(c[i]!= 0){
	while(*(c+i) != 0){
		i++;
	}
	return i;
}

int main(void){
	char ciao[5] = "ciao";
	printf("%d\n",strlen(ciao));
	char h[3]={'a','b','c'};
	printf("%d\n",strlen(h));
}
