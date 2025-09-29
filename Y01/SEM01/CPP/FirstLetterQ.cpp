#include <iostream>
using namespace std;

int main() {
    string x;
    cout << "Enter the string: ";
    getline(cin, x);
    x[0] = 'Q';
    cout << "New text: " << x << endl;
    return 0;
}
