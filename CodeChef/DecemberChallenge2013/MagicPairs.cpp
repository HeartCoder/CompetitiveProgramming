#include<iostream>
using namespace std;
int main()
{	
	int t,n,input;
	cin>>t;
	while(t--)
	{	
		long long count=0;
		cin>>n;
		for(int i=0;i<n;i++)
		{
			cin>>input;
		}
		for(int i=1;i<=n-1;i++)
			count+=i;
		cout<<count<<endl;
	}
	return 0;
}
	
