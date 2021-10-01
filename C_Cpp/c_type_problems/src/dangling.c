/** dangling pointers
 *
 */

#include "stdio.h"

int *x;

int * f1(){
    int a[] ={6,7,8,9};
    return a;
    }

int * f111(){
    int a[] ={7,8,9,10};
    return a;
    }


int * f2(){
    int a[] ={6,7,8,9};
    x = a;
}


int main(){
    
	// x punta a una zona di memoria sullo stack
    INLINE: {
          int a[] ={3,2,4,5};
          x = a;          
    }
    printf("%d\n", x[3]);
    // un blocco
    TEMP: {
        int a[] = {2,4,5,6};
    }
    printf("%d\n", x[3]);
    // IDEM con funzioni esterne
    x = f1();
    printf("%d\n", x[3]);
    // chiamo altra funzione
    f111();
    printf("%d\n", x[3]);
}


