// Check Pallindrom number
#include <iostream>
#include <cmath>
using namespace std;

int main() 
{
    long n,m,p,sum=0,i;
    cout<<"\nEnter any Integer Value: ";
    cin>>n;
    m=n; p=n;
    for(i=0; n>0; i++)
    n/=10;
    while(m>0)
    {
        int r=m%10;
        sum+=r*pow(10,i-1);
        m/=10;
        i--;
    }
    if(p==sum)
    cout<<"\n Number is Pallindrom";
    else
    cout<<"\n Number id not Pallindrom";
    return 0;
}
