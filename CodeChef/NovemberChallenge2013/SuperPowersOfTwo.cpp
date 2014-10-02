#include<stdio.h>
#define MOD 1000000007
inline void scan(int *input)
{
   char c=0;
   while(!(c>='0' && c<='9'))
   {
        c=getchar_unlocked();
    }
    *input=0;
    while(c>='0' && c<='9')
    {
        *input=*input*10+c-'0';
        c=getchar_unlocked();
       }
  }
unsigned long long power(unsigned long long bin)
{
    if(bin==0)
        return 1;
    unsigned long long temp=power(bin/2);
    if(bin%2==0)
        return (temp%MOD*temp%MOD)%MOD;
    return (2*temp%MOD*temp%MOD)%MOD;
}
unsigned long long bin(int n)
{
    unsigned  i;
    unsigned long long number=0;
    for(i=1<<20;i>0;i=i/2)
    {
        if(i&n)
            number=number*10+1;
        else
            number=number*10+0;
    }
    return number;
}
int main()
{
    int t,n;
    unsigned long long result,b;
    scan(&t);
    while(t--)
    {
        scan(&n);
        b=bin(n);
        result=power(b);
        result=(result%MOD*result%MOD)%MOD;
        printf("%llu\n",result);
    }
    return 0;
} 
 
