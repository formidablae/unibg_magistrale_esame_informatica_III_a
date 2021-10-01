/* esercizio 3: evito i dangling pointer 
   usando malloc */
#include<stdio.h>

int * copia (int i){
    int  * ptr_i = malloc(sizeof(int)) ;
    *ptr_i = i;
    return ptr_i;
}

int main (){
    // stavolta ptr_3 rimane in vita !!
    int * ptr_3 = copia(3);
    printf("valore di 3: %d\n", * ptr_3);
    // se riuso lo stack !
    {
        char c = 'a';
    }
    printf("valore di 3: %d\n", * ptr_3);
    // oppure se richiamo copia
    copia(5);
    printf("valore di 3: %d\n", * ptr_3);        
    getchar();
}



