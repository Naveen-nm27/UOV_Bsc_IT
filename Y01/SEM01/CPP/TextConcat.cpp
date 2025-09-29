
#include <iostream>
using namespace std;

int main() {
    string F_name, L_name;
    cout << "Enter the first name: ";
    getline(cin, F_name);
    cout << "Enter the last name: ";
    getline(cin, L_name);
    
    string full_name = F_name + " " + L_name;
    cout << "Full name is: " << full_name << endl;
    
    return 0;
}
