#include<iostream>
#include<vector>
#include<algorithm>
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
	int t;
	t=readInt();
	while(t--)
	{
		int n,w;
		n=readInt();
		vector<int> shops(n);
		for(int i=0;i<n;i++)
		{
			w=readInt();
			shops[i]=w + i;
		}
	sort(shops.begin(),shops.end(),greater<int>());
	cout<<shops[0]<<endl;
	}
	return 0;
}		
 
