#include "ListaInt.h"

struct ListInt{
	int* data;
	int freePos; // indica la prima posizione libera in data
};

ListIntRef mkList(int N){
	ListIntRef li = malloc(sizeof(struct ListInt));
	li->data = malloc(sizeof(int) * N);
	li->freePos = 0;
	return li;
}

void aggiungi(ListIntRef, int i);

char* toString(ListIntRef);

void freeListInt(ListIntRef l){
	free(l->data);
	free(l);
	// TODO l = NULL ma così non funziona
}


#endif /* LISTAINT_H_ */
