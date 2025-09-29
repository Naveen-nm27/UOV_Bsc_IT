#include <iostream>
#include <cmath>

using namespace std;

int main ()
{
    double pi = 3.14;
    int r,h,v,a;

    cout << "Enter the Radius: "<< endl;
        cin >>r;
    cout << "Enter the height: "<<endl;
        cin >>h;

    cout << "volume of the cylinder: " << pi * r * h << endl;

    cout << "Area of the cylinder: " << 2*pi * r * (r + h) << endl;

    return 0;
}
