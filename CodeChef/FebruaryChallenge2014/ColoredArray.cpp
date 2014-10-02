#include<iostream>
#include<algorithm>
#include<vector>
#include<utility>
#include<cstdio>
using namespace std;
inline int readInt()
{
   char c=0;
   while(!(c>='0' && c<='9'))
   {
        c=getchar_unlocked();
    }
    int input=0;
    while(c>='0' && c<='9')
    {
        input=input*10+c-'0';
        c=getchar_unlocked();
       }
        return input;
  }
 
int main()
{
	int t,n,m,k;
	t=readInt();
	while(t--)
	{
		n=readInt();
		m=readInt();
		k=readInt();;
		int initial[n];	
		int cost[n][m];
	vector<vector<pair<int,int> > > points(n,vector<pair<int,int> >(m));		
		for(int i=0;i<n;i++)
			initial[i]=readInt();
		int input;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				input=readInt();
				points[i][j].first=input;
				points[i][j].second=j+1;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				input=readInt();
				cost[i][j]=input;
			}
		}
		int nochange[n];
		for(int i=0;i<n;i++)
                {
                        for(int j=0;j<m;j++)
                        {
				
 
                               if(initial[i]!=points[i][j].second)
				{
			
                        	        points[i][j].first-=cost[i][j];
					
				}
				else
					nochange[i]=points[i][j].first;
				
                        }
                }
		for(int i=0;i<n;i++)
		{
			sort(points[i].begin(),points[i].end());
			reverse(points[i].begin(),points[i].end());
		}
		vector<int> ans(n);
		for(int i=0;i<n;i++)
		{
			if(points[i][0].first>nochange[i])
			ans[i]=points[i][0].first-nochange[i];
		          else
		            ans[i]=0;
		}
		sort(ans.begin(),ans.end(),greater<int>());
 
 
		int sol=0;
		int ind=0;
		for(int i=0;i<n;i++)
                {
                 
                        sol+=nochange[i];
                }       
		
		while(k)
		{
				
				if(ans[ind]<=0)
					break;
				
				sol+=ans[ind];
				 k--;
				ind++;
				
			
		}
		
		
		cout<<sol<<endl;
		
				
		
	}
	return 0;
}
