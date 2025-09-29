#include <iostream>
using namespace std;

int main() {
    string x;
    cout << "Enter any string: " << endl;
    getline(cin, x);
    int y = x.length();
    cout << "Number of characters in the string is: " << y << endl;
    return 0;
}
