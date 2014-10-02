#include<stdio.h>
inline void input(int *n) 
{
    *n = 0;
    char c;
    while (1)
    { 
              c=getchar_unlocked();
              if(c=='\n'||c==' ') break;
                              *n = (*n<<3)+(*n<<1)+c-48;
    }
    
}
 
int gcd(int a,int b)
{
	return b==0?a:gcd(b,a%b);
}
int main()
{
	int t,i,n,ms,mr;
	input(&t);
	while(t--)
	{
		input(&n);
		input(&ms);
		input(&mr);
		int s,r;
		int c=0;
		for( i=0;i<n;i++)
		{
 
			input(&s);
			input(&r);
			if(s>ms || r>mr)
				c++;
			
		}
		int ac;
		input(&ac);
		int g=gcd(ac,c);
		printf("%d/%d\n",c/g,ac/g);
	}
	return 0;
}
		
