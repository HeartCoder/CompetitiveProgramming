#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int arr[n];
		for(int i=0;i<n;i++)
			cin>>arr[i];
		sort(arr,arr+n);
		unsigned long long ans=0;
		for(int i=1;i<n;i++)
		{
			ans+=(unsigned long long )arr[i]*arr[0];
		}
		cout<<ans<<endl;
	}
	return 0;
} 
 
