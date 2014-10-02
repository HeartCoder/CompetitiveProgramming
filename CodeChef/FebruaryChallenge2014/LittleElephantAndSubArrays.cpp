#include<iostream>
#include<cmath>
using namespace std;
typedef unsigned long long ull;
int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
		cin>>arr[i];
	int q;
	cin>>q;
	while(q--)
	{
		int k;
		cin>>k;
		int pos[n],index=0,count=0;
		bool ok=false;
		ull ans=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				pos[index++]=i;
				ok=true;
				
			}
		}
		if(index==n)
		{
			ans=n*(n+1)/2;
			cout<<ans<<endl;
			continue;
		}
		if(!ok)
		{
			cout<<"0"<<endl;
			continue;
		}
		for(int i=0;i<index;i++)
		{
			int temp=pos[i]-1,left=0,right=0,mul=0;
			while(temp>=0 && arr[temp]>=k)
			{
				if(arr[temp]>k)
				{
					left++;
					temp--;
 
				}
 
				else if(arr[temp]==k)
				{
					left++;
					mul++;
					temp--;
				}
			}
			temp=pos[i]+1;
			while(temp<n && arr[temp]>=k)
			{
				right++;
				temp++;
			}
			if(mul)
			{
				ans+=left+right+1-mul+(left-mul)*right;
			}
			else if(!mul)
			{	
				ans+=left+right+1+left*right;
			}
			
		}
		cout<<ans<<endl;
	}
	return 0;
}
	
	
	
	
		
