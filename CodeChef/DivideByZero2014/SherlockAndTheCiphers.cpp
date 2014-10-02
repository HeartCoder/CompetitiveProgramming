#include<iostream>
using namespace std;
int main()
{
    int t;
    int n;
    string str;
    cin>>t;
    int arr[100000];
    while(t--)
    {
        cin>>n>>str;
        for(int i=0;i<n;i++)
            cin>>arr[i];
        int len=str.length();
        for(int i=0;i<len;i++)
        {
                char temp=str[i];
                str[i]=str[arr[i]-1];
                str[arr[i]-1]=temp;
        }
        cout<<str<<endl;
    }
    return 0;
}
 
