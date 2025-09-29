#include <iostream>
using namespace std;

int main () {
string name, country;

cout <<"Enter Your name "<< name;// cin >> name ;
getline(cin,name);
cout <<"Enter Your country  "<< country;// cin >> country ;
getline(cin,country);
cout<<"your name is "<<name<<" "<< "your country is "<< country;
return 0;
}
