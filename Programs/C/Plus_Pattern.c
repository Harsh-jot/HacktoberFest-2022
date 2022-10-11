//C program to print the plus pattern

#include<stdio.h>
#include <stdlib.h>
int main()
{
 int n,i,j,k,m,val=1;
 scanf("%d",&n);
 m=n/2;
//to print upper half pattern
 for(i=0;i<m;i++)
 {
 for(j=i;j>0;j--)
 printf("-");

 printf("*");

 for(j=i;j<m-1;j++)
 printf("-");

 printf("%d",val++);

 for(j=i;j<m-1;j++)
 printf("-");

 printf("*");

 for(j=i;j>0;j--)
 printf("-");

 printf("\n");
 }

//to print 1 to n numbers
 for(i=1;i<=n;i++)
 printf("%d",i);
 printf("\n");

//to print lower half pattern
 for(i=0;i<m;i++)
 {
 for(j=i;j<m-1;j++)
 printf("-");

 printf("*");

 for(j=i;j>0;j--)
 printf("-");

 printf("%d",++val);

 for(j=i;j>0;j--)
 printf("-");

 printf("*");

 for(j=i;j<m-1;j++)
 printf("-");

 printf("\n");
 }
}
