#include <iostream>
#include <cstring>
using namespace std;
 
int main() {
	// your code goes here
      int t;
      string s;
      cin>>t;
      while(t--)
      {
         cin>>s;
         bool flag=0;
         int len=s.length();
         for(int i=0;i<len-2;i++)
         {
             if(s[i]==s[i+2]  && s[i]!=s[i+1])
              {
                  flag=1;
                   break;
              }
          }
        if(flag==1)
           cout<<"Good"<<endl;
        else
           cout<<"Bad"<<endl;
     }
 
	return 0;
} 
