#include <stdio.h>


/** assegnamento diretto ad un puntatore */
int main(){
	int x = 5;
    int* i = &x;
    printf("valore di ptr  %d  *ptr %d",i,*i);
    i = (int*) 2280759;
    printf("valore di ptr  %d  *ptr %d",i,*i);
    *i = 300;
    printf("valore di ptr  %d  *ptr %d",i,*i);
    return 0;
}
