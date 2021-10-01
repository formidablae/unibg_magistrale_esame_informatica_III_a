// usiamo STL
#include <iostream>
#include <vector>
using namespace std;

int mainccc() {
	vector<int> v(0,70);
	//v[0] = 90;
	cout << v.size()<<" " << v.capacity() << endl;
	v.push_back(8);
	cout << v.size()<< " " << v.capacity() << endl;
	v.push_back(80);
	cout << v[0] <<  " "<< v[1] << endl;
	cout << v.size()<< " " << v.max_size() << endl;
	v.push_back(180);
	for(unsigned int i = 0 ; i < v.size(); i++)
		cout << v[i] << endl;

	for(vector<int>::iterator i = v.begin(); i != v.end(); i++)
		cout << *i << endl;
	for(vector<int>::iterator i = v.end(); i != v.begin(); --i)
		cout << *i << endl;
}
