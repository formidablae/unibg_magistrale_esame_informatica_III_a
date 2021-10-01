#include<stdio.h>

int * copia (int i){
    int  x = i ;
    int * p = &x;
    return p;
}

int main (){
    int * ptr_3 = copia(3);
    // a questo punto ptr_3 è dangling
    // la prima volta non ho problemi:
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



