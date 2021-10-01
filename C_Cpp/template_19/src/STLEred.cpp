// usiamo STL ed ereditarietà
#include <iostream>
#include <vector>
using namespace std;

class persona{
	public: virtual void stampa(){cout << "persona" << endl;}};
class studente: public persona{
	public: virtual void stampa(){cout << "studente" << endl;}};

int  main() {
	/* NO vector<persona> gente;
	studente s1,s2;
	gente.push_back(s1);
	gente.push_back(s2);
	gente[0].stampa();*/
	vector<persona*> gente;
	studente s1,s2;
	gente.push_back(&s1);
	gente.push_back(&s2);
	gente[0]->stampa();
}
