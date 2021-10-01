#include "stdio.h"
#include "stdlib.h"

struct Point {
	int x;
	int y;
};

struct Point *newPoint(int x, int y) {
	/*struct Point result =  {x,y};
	 return &result;*/
	struct Point * result = (struct Point*) malloc(sizeof(struct Point));
	result->x = x;
	result->y = y;
	return result;
}

void m() {
	int h = 10;
	int g = 20;
}

int main() {
	struct Point *p = newPoint(1, 2);
	printf("%d", p->y);

	printf("\n----------\n");
	m();
	printf("%d", p->y);
	//getch();
	return 0;
}
