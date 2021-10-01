#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//https://ide.geeksforgeeks.org/ 

char* RESULT;

char* vocalizza_nr(char* str){
        char* buff = (char*) malloc((strlen(str)+1)*sizeof(char));

        int i = 0, j = 0;

        while(str[i]){
                if(str[i]=='a' || str[i]=='e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u'){
                        buff[j]=str[i];
                        i++;
                        j++;
                }else{
                        i++;
                }
        }
        buff[j]='\0';
        return buff;
}

char* vocalizza_nr_pointer(char* str){
      char* buff = (char*) malloc((strlen(str)+1)*sizeof(char));
        int j=0;
        while(*str!='\0'){
                if(*str=='a' || *str=='e' || *str == 'i' || *str == 'o' || *str == 'u'){
                	printf("LETTER %c\n", *str);
                        buff[j]=*str;
                        j++;
                }
                str++;
        }
       buff[j]='\0';
        return buff;
}


//con free della memoria
char* vocalizza_ric(char* str){
        if(!str[0]){
                char* b = (char*) malloc(sizeof(char));
                *b='\0';
                return b;
        }
        char* r = vocalizza_ric(str+1);
        if(*str=='a' || *str=='e' || *str == 'i' || *str== 'o' || *str== 'u'){
                char* b = (char*) malloc((strlen(r)+2)*sizeof(char));
                sprintf(b, "%c%s", str[0], r);
                free(r);
                return b;
        }else{
                return r;
        }
}


char* vocalizza_tr(char* str, char* buff, int j){
        if(!str[0]){
                buff[j] = '\0';
                return buff;
        }

        if(*str=='a' || *str=='e' || *str == 'i' || *str== 'o' || *str== 'u'){
                buff[j] = *str;
                return vocalizza_tr(str+1, buff, j+1);
        }else{
                return vocalizza_tr(str+1, buff, j);
        }
}



int main(void) {
        char str[] = "angelo";
        printf("%s\n", str);

    RESULT = vocalizza_nr(str);
        printf("%s\n", RESULT);
        free(RESULT);

RESULT = vocalizza_nr_pointer(str);
        printf("POINT %s\n", RESULT);
        free(RESULT);
        
        
    RESULT = vocalizza_ric(str);
        printf("%s\n", RESULT);
free(RESULT);
        char* buff = (char*) malloc((strlen(str)+1)*sizeof(char));
    RESULT = vocalizza_tr(str, buff, 0);
        printf("%s\n", RESULT);
free(RESULT);
        /*
         * Nel caso della Tail Recursion si può riutilizzare sempre la stessa area di memoria invece di creare nuovi record di
         * attivazione. Questo comporta un grande risparmio di memoria ed è dovuto al fatto che ad ogni ciclo il RRA
         * punta direttamente alla locazione di memoria in cui la funzione è invocata per la prima volta
         */
//free(buff);
        return EXIT_SUCCESS;
}

