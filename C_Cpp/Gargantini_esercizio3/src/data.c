#include "data.h"
#include <string.h>
#include <stdlib.h>
#include <stdio.h>

struct data{
	int mese, giorno, anno;
	char* fuso;
};

data_ref creazione(int gg, int mm, int aa, char* fuso){
	data_ref nuovadata = malloc(sizeof(struct data));

	// Controllo sulla validità del mese
	if(mm < 0 || mm > 12){
		nuovadata->mese=1;
	} else {
		nuovadata->mese = mm;
	}
	// Controllo sulla validità del giorno
	if(gg < 0){
		nuovadata->giorno = 1;
	} else {
		switch(mm){
		case 11:
		case 4:
		case 6:
		case 9:
			if(gg > 30){
				nuovadata->giorno = 1;
			} else {
				nuovadata->giorno = gg;
			}
			break;
		case 2:
			if(gg > 28){
				nuovadata->giorno = 1;
			} else {
				nuovadata->giorno = gg;
			}
			break;
		default:
			if(gg > 31){
				nuovadata->giorno = 1;
			} else {
				nuovadata->giorno = gg;
			}
			break;
		}
	}

	// Inserimento dell'anno
	nuovadata->anno = aa;

	nuovadata->fuso = malloc(strlen(fuso)+1);
	strcpy(nuovadata->fuso,fuso);

	return nuovadata;
}

char* toString(data_ref data){
	char* stringa = malloc(sizeof(char)*(10+strlen(data->fuso)));
	//printf("%d-%d-%d-%s\n", data->giorno, data->mese, data->anno, data->fuso);
	sprintf(stringa, "%d-%d-%d-%s\n", data->giorno, data->mese, data->anno, data->fuso);
	return stringa;
}

void distruzione(data_ref* data){
	free((*data)->fuso);
	free(data);
	*data = NULL;
}


