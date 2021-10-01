
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// versione iterativa
char* vocalizza_i(char* s){
	char* result = malloc((strlen(s)+1)*sizeof(char));
	// risultato allocato nello heap
	int j = 0; // posizione corrente in result
	while(*s){
		if (*s == 'a' ||*s == 'e'||*s == 'i'||*s == 'o'){
			result[j++]= *s;
			result[j] = '\0'; // terminatore corretto
			printf("parziale: %s\n",result);
		}
		s++;
	}
	return result;
}
// vwrsione ricorsiva no tail di vocalizza
char* vocalizza_r(char *s){
	if (*s=='\0'){
		//  restituisci string vuota
		char* res = malloc(sizeof(char));
		*res = '\0';
		return res;
	} else{
		char* res = vocalizza_r(s+1);
		if (*s == 'a' ||*s == 'e'||*s == 'i'||*s == 'o'){
			// aggiungi come prefisso *s
			char* stringafinale =
					malloc((strlen(res)+2)*sizeof(char));
			// metti il primo char
			sprintf(stringafinale,"%c",s[0]);
			// concatena il risultato
			strcat(stringafinale,res);
			// free di res che non serve più
			free(res);
			return stringafinale;
		} else{
			return res;
		}
	}
}

int main(void) {
	char nome[] = "giova";
	char *res = vocalizza_i(nome);
	printf("%s\n", res);
	// ricorsiva
	printf("%s\n", vocalizza_r(nome));
	return EXIT_SUCCESS;
}
