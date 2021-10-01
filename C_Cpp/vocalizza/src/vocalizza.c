#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* RESULT;

void f(){
	char* p = malloc(19999);
	// ...

}


char* vocalizza_i(char* s){
	// buffer di appoggio con vocali
	char* vocali = (char*)malloc(sizeof(char)*(strlen(s)+1));
    int v = 0;
    for(;*s;s++){
    	if(s[0] == 'a' || s[0] == 'e' || s[0] == 'o'){
    		vocali[v++] = s[0];
    	}
    }
    vocali[v] = 0;
    return vocali;
}

char* vocalizza_r(char *s){
	printf("chiamata vocalizza ricorsiva su %s lunghezza %d\n",s, strlen(s));
	if (*s == '\0'){
		// string vuota
		char* sv = (char*)malloc(sizeof(char));
		sv[0] = 0;
		return sv;
	} else{
		char* vsp1 = vocalizza_r(s+1);
    	if(s[0] == 'a' || s[0] == 'e' || s[0] == 'o'){
    		// return s[0] + vsp1
    		char* result = (char*)malloc(sizeof(char)*(strlen(vsp1)+2));
    		sprintf(result, "%c%s", s[0],vsp1);
    		return result;
    	} else{
    		// return vsp1
    		return vsp1;
    	}
	}
}
// s da vocalizzare
// vocali: buffer contente le vocali
// nv: numero di vocali accumulate fino ad ora
char* vocalizza_tr(char* s,char* vocali, int nv ){
	printf("chiamata vocalizza ricorsiva su %s vocali: %s\n",s, vocali);
	if (*s==0)
		return vocali;
   	if(s[0] == 'a' || s[0] == 'e' || s[0] == 'o'){
   		// aggiungi vocale
   		vocali[nv++] = s[0];
   	}
	return vocalizza_tr(s+1,vocali,nv);
}
char* vocalizza_tr_s(char* s){
	return vocalizza_tr(s,malloc(sizeof(char)*(strlen(s)+1)),0);
}


int main(void) {
	char p[]= "angelo";
	RESULT = vocalizza_i(p);
	printf("%s\n",RESULT);
	RESULT = vocalizza_r(p);
	printf("%s\n",RESULT);
	RESULT = vocalizza_tr_s(p);
	printf("%s\n",RESULT);
	return EXIT_SUCCESS;
}
