#include<string.h>
#include<stdio.h>

char * foo(char *s){
       char *c = malloc(sizeof(char)*10);
       strcpy(c,s);
       return strchr(c,'x');

}

int main (int argc, char ** argv){

     char * c = foo(argv[1]);
     c++;
     printf("sottostringa %s",c);
     return (*c);
     
}
