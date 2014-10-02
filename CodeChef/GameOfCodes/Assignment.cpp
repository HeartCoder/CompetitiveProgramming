#include<iostream>
using namespace std;
int main()
{
	int t,n;
	cin>>t;
	while(t--)
	{
		cin>>n;
		int arr[n];
		for(int i = 0;i < n;i++)
			cin>>arr[i];
		int count,incr,max = 0;
		for(int i = 0;i < n;i++)
		{	
			count = 1;
			incr = 1;
			for(int j = i + 1;j < n;j++)
			{
				if(arr[j] == arr[i] + incr)
				{
					count++;
				}
				incr++;
			}
			if(max < count)
				max = count;
		}
		cout<<n - max<<endl;
	}
		return 0;
	}
 
