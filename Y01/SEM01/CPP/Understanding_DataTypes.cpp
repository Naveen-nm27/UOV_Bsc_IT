#include <iostream>
using namespace std;

int main() {
    int a;
    float b;
    double c;
    char d;
    string e;
    bool f;

    cout << "Enter an integer: ";
    cin >> a;

    cout << "Enter a float: ";
    cin >> b;

    cout << "Enter a double: ";
    cin >> c;

    cout << "Enter a character: ";
    cin >> d;

    cout << "Enter a string: ";
    cin >> e;

    cout << "Enter a boolean (0 or 1): ";
    cin >> f;

    cout << "Integer is " << a << endl;
    cout << "Float is " << b << endl;
    cout << "Double is " << c << endl;
    cout << "Char is " << d << endl;
    cout << "String is " << e << endl;
    cout << "Bool is " << f << endl;

    return 0;
}
