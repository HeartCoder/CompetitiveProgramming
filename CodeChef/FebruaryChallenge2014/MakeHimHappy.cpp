#include<iostream>
#include<vector>
#include<algorithm>
#include<utility>
#include<cstdio>
#include<cstring>
using namespace std;
typedef unsigned long long ull;
int look(vector<pair<pair<int,int>,bool > >& arr,int pos,int num)
{
	int start=0,end=pos;
	
	while(start<=end)
	{
		int mid=(start+end)/2;
		if(arr[mid].first.first==num && !arr[mid].second )
		{
			
			arr[mid].second=true;
			return mid;
			
		}
		else if(arr[mid].first.first>num)
			end=mid-1;
		else if(arr[mid].first.first<=num)
			start=mid+1;
	}
	return -1;
}
	
      
	
int low(int a,int b)
{
	return a<b?a:b;
}
int max(int a,int b)
{
	return a>b?a:b;
}
int min(int a,int b,int n)
{
	int both_left=max(a,b);
	int both_right=max(n-1-a,n-1-b);
	int left_right=low(max(a,n-1-b),max(b,n-1-a));
	int ans=both_left;
	if(both_right<ans)
		ans=both_right;
	if(left_right<ans)
		ans=left_right;
	return ans;
}
int main()
{
	int n,k,input;
	scanf("%d",&n);
	scanf("%d",&k);
	vector<pair<pair<int,int>,bool> >arr(n);
	for(int i=0;i<n;i++)
	{
		scanf("%d",&input);
		arr[i].first.first=input;
		arr[i].first.second=i;
		arr[i].second=false;
	}
	int pos=n-1;
	sort(arr.begin(),arr.end());
	for(int i=0;i<n;i++)
	{
		if(arr[i].first.first>=k)
		{
			
			pos=i-1;
			break;
		}
		
 
	}
	ull minimum=1000000,val,sum;
	bool ok=false;
		
	for(int i=0;i<pos;i++)
	{
			int c=look(arr,pos,k-arr[i].first.first);
			while(c!=-1)
			{
			
			if(arr[i].first.first!=arr[c].first.first)
           	        {       
                       		
                                	 ok=true;
                               		 val=min(arr[i].first.second,arr[c].first.second,n);
                                	 if(val<minimum)
                                        	minimum=val;
                                 
				
                                
                        }
			
			c=look(arr,pos,k-arr[i].first.first);
			
			}
			
		
	}
 
	if(!ok)
	cout<<"-1"<<endl;
	else
	cout<<minimum+1<<endl;
	return 0;
} 
