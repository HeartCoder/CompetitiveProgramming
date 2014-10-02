#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	int n,m;
	while(t--)
	{
		cin>>n>>m;
		vector<string> str(n);
		for(int i=0;i<n;i++)
			cin>>str[i];
		for(int i=0;i<n;i++)
		{
			reverse(str[i].begin(),str[i].end());
			cout<<str[i];
			cout<<endl;
		}
	}
	return 0;
}
