#include <stdio.h>

struct Point {int x; int y;};

struct Point *newPoint(int x,int y) { 

   struct Point result = {x,y}; 

   struct Point * z = &result;

   return z;

}

void bar() { 

    struct Point *p = newPoint(1,2); 

    p->y = 1234;

    struct Point *p2 = newPoint(3,4);

    printf("%d", p->y);

}

int main(){
	bar();
}
