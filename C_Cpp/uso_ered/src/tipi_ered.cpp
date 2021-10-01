/*
 * tipi_ered.cpp
 *
 *  Created on: 31/ott/2012
 *      Author: garganti
 */

class CB{
private: int pri;
protected:	int pro;
public:	int pub; };

class CDPub: public CB{};
class CDPri: private CB{
public:
	CDPri(){pro = 0;}
};
int main() {
	CB * p = new CDPub;// Sì: CDPub è sottoclasse e sottotipo
	CB * d = new CDPri;
	CDPub c1;
	//c1.pri;
	c1.pub = 0;
	//
	CDPri c2;
	//c2.pub;
	//
	CB c3;
	c3.pub = 9;
	return 0;
}
