#include<iostream>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int a,b;
		cin>>a>>b;
		long long ans=a>b?a:b;
		cout<<ans<<" "<<(long long)a+b<<endl;
	}
	return 0;
} 
