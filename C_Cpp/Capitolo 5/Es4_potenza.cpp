#include <iostream>
#include <vector>
#include <math.h>

using namespace std;

int main()
{
    vector <int> g1;
    vector <int> :: iterator i;
    vector <int> :: reverse_iterator ir;

    for (int i = 0; i < 10; i++)
        g1.push_back(pow (2, i) );

    cout << "Ordine crescente\t:\t";
    for (i = g1.begin(); i != g1.end(); ++i)
        cout << *i << '\t';

    cout << endl << endl;
    cout << "Ordine decrescente\t:\t";
    for (ir = g1.rbegin(); ir != g1.rend(); ++ir)
        cout << '\t' << *ir;

    return 0;

}
