#include<iostream>
#include<cstdio>
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
 
using namespace std;
int main()
{
	int t,n;
	t=readInt();
	unsigned long long ans;
	while(t--)
	{
		n=readInt();
		int dummy,count=0,two=0;
		for(int i=0;i<n;i++)
		{
			dummy=readInt();
			if(dummy==0 || dummy==1)
				count++;
			else if(dummy==2)
				two++;
		}
		ans=(unsigned long long)(n-count)*(n-count-1)/2;
		ans=ans-(unsigned long long)two*(two-1)/2;
		printf("%llu\n",ans);
	}
	return 0;
}
 
 
