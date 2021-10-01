#include <iostream>
#include <map>

using namespace std;

int main() {
	map<string, int> nomevoti;
	nomevoti.insert(map<string,int>::value_type("Name1",20));
	nomevoti.insert(map<string,int>::value_type("Name2",25));
	nomevoti.insert(map<string,int>::value_type("Name3",24));
	nomevoti.insert(map<string,int>::value_type("Name4",30));

	map<string,int>::iterator iter = nomevoti.begin();
	for(iter; iter!=nomevoti.end();++iter)
		{
			cout<<"nome: "<<iter->first<<" voto: "<<iter->second<<endl;
		}

	cout<<"Cerca nome ------------------"<<endl;
	string cercaNome="Name2";
	iter = nomevoti.begin();
	for(iter; iter!=nomevoti.end();++iter)
			{
				if (iter->first.compare(cercaNome)==0)
				cout<<"nome: "<<iter->first<<" voto: "<<iter->second<<endl;
			}

	return 0;
}
