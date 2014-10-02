#include<iostream>
using namespace std;
int main()
{
    int t;
    string a,b;
    cin>>t;
    while(t--)
    {
        cin>>a>>b;
        int max=-1,max2=-1;
        for(int i=0;i<a.length();++i)
        {
            if(a[i]-48>max)
                max=a[i]-48;
        }
        for(int i=0;i<b.length();++i)
        {
            if(b[i]-48>max2)
                max2=b[i]-48;
        }
        max++;
        max2++;
        int base=1,base2=1;
        int ans=0,ans1=0;
        for(int i=a.length()-1;i>=0;--i)
        {
            ans=ans+(a[i]-48)*base;
            base*=max;
        }
        for(int i=b.length()-1;i>=0;--i)
        {
            ans1=ans1+(b[i]-48)*base2;
            base2*=max2;
        }
        cout<<ans+ans1<<endl;
    }
    return 0;
}
 
