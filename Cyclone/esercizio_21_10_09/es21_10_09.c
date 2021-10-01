#include<stdio.h>

int strlen(const char *s){
  char* p = s;
  int i;
  for(i = 0; *p; i++ ){      
      p++;
  }
  return i;
}

int main(){
  
   char a[10] = "pippo";
   printf("s:%s l:%d",a,strlen(a));    

   char b[4] = "pippo";
   printf("s:%s l:%d",b,strlen(b));    


}