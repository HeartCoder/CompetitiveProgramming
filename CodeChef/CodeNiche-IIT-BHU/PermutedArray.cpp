#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,k;
		cin>>n>>k;
		int arr[n],arr1[n];
		for(int i=0;i<n;i++)
			cin>>arr[i];
		for(int i=0;i<n;i++)
			cin>>arr1[i];
		sort(arr,arr+n);
		sort(arr1,arr1+n,greater<int>());
		bool flag=true;
		for(int i=0;i<n;i++)
		{
			if(arr[i]+arr1[i]<k)
			{
				flag=0;
				break;
			}
		}
		if(flag)
			cout<<"YES"<<endl;
		else
			cout<<"NO"<<endl;
	}
	return 0;
}
 
