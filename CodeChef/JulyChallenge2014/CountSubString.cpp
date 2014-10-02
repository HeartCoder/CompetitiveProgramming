#include <iostream>
using namespace std;
 
int main() {
	int t;
	cin>>t;
	int n;
	while(t--)
	{
		cin>>n;
		string arr;
		cin>>arr;
		long long count = 0;
		for(int i = 0;i < n;i++)
		{
			if(arr[i] == '1')
				count++;
		}
		
		cout<<(unsigned long long ) count * (count + 1) / 2<<endl;
	}
	return 0;
} 
