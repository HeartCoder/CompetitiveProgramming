#include<iostream>
using namespace std;
int min(int a,int b)
{
	return a>b?b:a;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		string str,str1;
		cin>>str>>str1;
		int arr[62]={0},arr1[62]={0};
		int len=str.length();
		int len1=str1.length();
		for(int i=0;i<len;i++)
		{
			if(str[i]<='Z' && str[i]>='A')
				arr[str[i]-65]++;
			else if(str[i]>=97)
				arr[str[i]-71]++;
			else
				arr[str[i]+4]++;
 
		
		}
		int count=0;
		
		for(int i=0;i<len1;i++)
		{
			if(str1[i]<='Z' && str1[i]>='A')
				arr1[str1[i]-65]++;
			else if(str1[i]>=97)
				arr1[str1[i]-71]++;
			else
				arr1[str1[i]+4]++;
		}
		for(int i=0;i<62;i++)
		{
			if(arr[i] && arr1[i])
				count+=min(arr[i],arr1[i]);
		}
		cout<<count<<endl;
	}
	return 0;
}
		
