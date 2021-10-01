#include "stdio.h"
#include "stdlib.h"

/** versione corretta */
char * itoa(int i){
	char* buf = (char*)malloc(100);
	sprintf(buf,"%d",i);
	return buf;
}


int main(){
     char* l = itoa(1) ;    
     printf("1 vale %s\n",l);
}
