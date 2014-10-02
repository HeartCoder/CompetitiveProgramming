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
}
int main()
{
    int t,k,i,n;
    scan(&t);
    while(t--)
    {
        scan(&n);
        int list[n];
        for(i=0;i<n;i++)
            scan(&list[i]);
        scan(&k);
        int counter=0;
        for(i=0;i<n;i++)
        {
            if(list[k-1]>list[i])
                counter++;
        }
        printf("%d\n",counter+1);
    }
    return 0;
}
