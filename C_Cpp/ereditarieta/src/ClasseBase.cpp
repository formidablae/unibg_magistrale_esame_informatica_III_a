// regole di visibilità tra classi base e derivate

class ClasseBase{
public:
	void pub(){}
	void pub2(){}
private:
	void pri(){}
protected:
	void pro(){}
};

class ClasseDPub: public ClasseBase{};

class ClasseDPri: private ClasseBase{
public:
	ClasseBase::pub2;
};


void f(){
	ClasseBase cb;
	cb.pub();
	//cb.pri(); // ERRORE !!!
	//
	ClasseDPub cdp;
	cdp.pub();

	ClasseDPri cdpri;
	//cdpri.pub(); // ERRORE !!!
}
