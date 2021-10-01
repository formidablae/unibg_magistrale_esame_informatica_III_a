/** uso di const
 *
 */

void f(const int i){
     
     // errore      i = 0;     
}


void f2(const int *i){
     
     // errore
     // (*i) = 0;
     // lecito:
     i ++;     
     
}
