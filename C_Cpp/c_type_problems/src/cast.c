#include <stdio.h>


/** cast implicito non controllato senza alcun warning - qualche problema poi
 *
 */
int main(){
    short  s;
    double y = 980957450973407.78;
    int i;
    i = 500000;
    s = i;
    printf("valore di s  %d\n",s);
    s = y;
    printf("valore di s  %d\n",s);
    return 0;
}
