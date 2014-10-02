#include<stdio.h>
#include<string.h>
inline void scan(int *value)
{
    char ch=0;
    *value=0;
    while(!(ch>=48 && ch<=57))
    {
        ch=getchar();
    }
    while(ch>=48 && ch<=57)
    {
        *value=*value*10+ch-'0';
        ch=getchar();
    }
}main()
{
   int t,n,c;
   scan(&t);
   while(t--)
   {
      scan(&n);
      scan(&c);
      if(n<=c)
      printf("0\n");
      else
      {
          if(n%c==0)
          printf("%d\n",n/c-1);
          else
          printf("%d\n",n/c);
        }
     }
     return 0;
  }  
