#include "stdio.h"
#include "stdlib.h"

int f (char a[20]){
    a[19] = 'g';
}

int h (int n, int a[n]){}

int strlen(const char *s){
   if (!s) return 0;
    int i = 0;
    for(;;){
            if (!*s) break;
            i++;
            s++;
    }
    return i;
}

int main(){
    char hello[20] = "hell";
    f(hello);
    
    char jj[10] ="";
    f(jj);
    
    printf("%d\n",strlen(hello));
    
    char h[] ={'g'};
    printf("%d\n",strlen(h));
     
    getch();
    
}
