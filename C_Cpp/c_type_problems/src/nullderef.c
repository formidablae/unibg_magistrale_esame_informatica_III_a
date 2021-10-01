#include <stdio.h>
#include <stdlib.h>

/** dereferenziazione di puntatore null
 *
 */

int main(void){
	int x = 5;
    int* ptr = &x;
    printf("value of *ptr %d", *ptr);
    ptr = NULL; // invalida il puntatore
    printf("value of *ptr %d", *ptr);
    *ptr = 2;
    return EXIT_SUCCESS;
}
