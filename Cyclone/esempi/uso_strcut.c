struct IntPair { int x; int y; };

struct IntPair * same(int z) {
    struct IntPair * ans =
          (struct IntPair *)malloc(sizeof(struct IntPair));
    ans->x = z;
    ans->y = z;
    return ans;
}

void main(){


}