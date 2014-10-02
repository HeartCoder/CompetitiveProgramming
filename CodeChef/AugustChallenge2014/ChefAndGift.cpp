#include <iostream>
using namespace std;
 
int main() {
	int t,n,k;
	cin>>t;
	while(t--){
		cin>>n>>k;
	
		int arr[n];
		for(int i = 0;i < n;i++){
			cin>>arr[i];
		}
		bool flag  = false;
		if(k == 0){
			for(int i = 0;i < n;i++){
				if(arr[i] & 1){
					cout<<"YES"<<endl;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			continue;
		}
		int count = 0;
		
		
		for(int i = 0;i < n;i++){
			if(!(arr[i] & 1)){
				count++;
			}
			if(count == k){
				cout<<"YES"<<endl;
				flag = true;
				break;
			}
			
		}
		if(!flag){
			cout<<"NO"<<endl;
		}
	}
	
	return 0;
} 
