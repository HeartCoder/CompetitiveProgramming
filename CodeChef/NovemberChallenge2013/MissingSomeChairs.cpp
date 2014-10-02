#include<stdio.h>
#define MOD 1000000007
long long power(int n)
{
 
    if(n==0)
        return 1;
        long long temp=power(n/2);
    if(n%2==0)
        return (temp%MOD*temp%MOD)%MOD;
    else
        return 2*(temp%MOD*temp%MOD)%MOD;
}
int main()
{
    int t,n;
    long long result;
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d",&n);
        result=power(n);
        printf("%lld\n",result-1);
 
    }
    return 0;
}
 
