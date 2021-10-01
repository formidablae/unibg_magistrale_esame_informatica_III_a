#include <iostream>
using namespace std;

class Serilizer {
public: void serilize();
};
class Arbitro: public Serilizer{
	char* name;
public:
	void setName(char*);
};

class Gioco: public Serilizer{
public:
	void setName(char*);
	void start();
};

class Partita: public Arbitro, public Gioco{

};

int main() {
	Partita p;
	p.Arbitro::Serilizer::serilize();
	p.Arbitro::setName("");
	p.start();
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	return 0;
}
