
class A{
public:
	A(){}
};

class B{
public:
	B(){}
};

class C: public A,B{
public:
	C():A(),B(){}

};

int main(){
	C c1;
}
