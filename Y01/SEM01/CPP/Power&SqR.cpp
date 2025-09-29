#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int x, y;
    cout << "Enter the number 01: ";
    cin >> x;
    cout << "Enter Number 02: ";
    cin >> y;

    int power = pow(x, y);
    cout << x << " raised to the power of " << y << " is: " << power << endl;

    cout << "Square root of " << x << " is: " << sqrt(x) << endl;
    cout << "Minimum of two numbers is: " << min(x, y) << endl;
    cout << "Maximum of two numbers is: " << max(x, y) << endl;

    return 0;
}
