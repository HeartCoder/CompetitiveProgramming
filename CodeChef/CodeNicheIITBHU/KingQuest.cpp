#include<iostream>
using namespace std;
int main()
{
	string str;
	cin>>str;
	int hash[26]={0};
	for(int i=0;i<str.length();i++)
		hash[str[i]-97]++;
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(hash[str[i]-97]&1)
			count++;
	}
	if(count>1)
		cout<<"NO"<<endl;
	else
		cout<<"YES"<<endl;
	return 0;
}
 
