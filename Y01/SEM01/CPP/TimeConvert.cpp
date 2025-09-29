#include <iostream>
using namespace std;

int main ()
{
    int h,m,s,t;

    cout << "Enter the number of hours: ";
    cin >> h;
    cout << "Enter the number of minutes: "<<'\n';
    cin >> m;
    cout << "Enter the number of Seconds: "<<'\n';
    cin >>s;

    cout << "Total Time in seconds is: " << h * 36000 + m * 60 + s;

    return 0;

}
