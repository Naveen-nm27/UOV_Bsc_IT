
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double a, b;
    cout << "Enter a double number: ";
    cin >> a;
    cout << "Enter another double number: ";
    cin >> b;

    cout << "Raised to the Power of " << b << " is: " << pow(a, b) << endl;
    cout << "Square root of " << a << " is: " << sqrt(a) << endl;
    cout << "Square root of " << b << " is: " << sqrt(b) << endl;
    cout << "Minimum of two numbers is: " << min(a, b) << endl;
    cout << "Maximum of two numbers is: " << max(a, b) << endl;

    return 0;
}
