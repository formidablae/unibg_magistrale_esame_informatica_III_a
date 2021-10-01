
#ifndef TIME_HPP_
#define TIME_HPP_

class Time{

public:
	Time();
	Time(int);// costruttore per ora
	Time(int,int,int);// costruttore ora min e secondi
	void printStandard() const;

private:
	int hour, minute, second;

};




#endif /* TIME_HPP_ */
