//============================================================================
// Name        : polimorfismo.cpp
// Author      :
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Animal {
public:
	virtual void eat() {
		cout << "I eat like a generic Animal." << endl;
	}
};

class Wolf: public Animal {
public:
	void eat() {
		cout << "I eat like a wolf!" << endl;
	}
};

class Fish: public Animal {
public:
	void eat() {
		cout << "I eat like a fish!" << endl;
	}
};

class GoldFish: public Fish {
public:
	void eat() {
		cout << "I eat like a goldfish!" << endl;
	}
};

class OtherAnimal: public Animal {
};

int main() {
	// PUNTATORI E VIRTUAL
	Animal* anAnimal[5];

	anAnimal[0] = new Animal();
	anAnimal[1] = new Wolf();
	anAnimal[2] = new Fish();
	anAnimal[3] = new GoldFish();
	anAnimal[4] = new OtherAnimal();

	for (int i = 0; i < 5; i++) {
		anAnimal[i]->eat();
		delete anAnimal[i];
	}

	// SENZA PUNTATORI
	Wolf w;
	Animal tigre = w;
	tigre.eat();
	return 0;
}

// PROVATE A togliere virtual al metodo eat