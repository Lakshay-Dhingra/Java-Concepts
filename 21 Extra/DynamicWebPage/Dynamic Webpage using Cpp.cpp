#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	string name;
	int age,n;
	cout<<"Enter Your Name, Age, N: ";
	cin>>name>>age>>n;
	ofstream out("lak.html");
	out<<"<html><body><font size=24 color=\"blue\">\n";
	for(int i=0;i<n;i++)
	{
		out<<"Name: "<<name<<" Age: "<<age<<"<br>\n";
	}
	out<<"</font></body></html>";
	out.close();
	return 0;
}
