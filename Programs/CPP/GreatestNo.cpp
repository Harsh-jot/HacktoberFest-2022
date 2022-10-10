#include <cmath>
#include <iostream>

using namespace std;

int main()
{
    int n,temp=0;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(int i=1;i<n;i++)
    {
         if(a[i-1]>a[i])
         {
             temp = a[i-1];
             a[i-1]=a[i];
             a[i]=temp;
         }
         else
         {
             temp = a[i];
         }
    }
    cout<<temp;
    return 0;
}
