#include <vector>
#include <iostream>
using namespace std;


class Persona {
public:
	virtual void print() {
		cout << "persona";
	}
};
class Studente: public Persona {
public:
	virtual void print() {
		cout << "studente";
	}
};

class Classe {
private:
	vector<Persona*> members;

public:
	void addPerson(Persona* p) {
		members.push_back(p);
	}
	void print() {
		for (vector<Persona*>::iterator i = members.begin();
				i != members.end();
				i++) {
			(*i)->print();
		}
	}
};

int main(int argc, char **argv) {
	Classe c;
	Persona p1;
	Persona p2;
	Studente s2;
	c.addPerson(&p1);
	c.addPerson(&p2);
	c.addPerson(&s2);
	c.print();
}

