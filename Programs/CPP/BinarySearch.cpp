// search an element in the list by binary search method
#include <iostream>
using namespace std;

int main() 
{
    float x;
    int n,f,l,mid,flag=0,i,pos;
    cout<<"\n Enter the size of list";
    cin>>n;
    float a[n];
    f=0; l=n-1;
    cout<<"ENter order in acending order ";
    for(i=0; i<n; i++)
    cin>>a[i];
    cout<<"\nEnter the desired element ";
    cin>>x;
    mid = (f+l)/2;
    while(f<=l&&flag==0)
    {
        if(a[mid]==x)
        {
            flag=1;
            pos=mid;
        }
        else
        {
            if(a[mid]<x)
             f=mid+1;
            else
             l=mid-1;
            mid=(f+l)/2;
        }
    }
    if(flag==1)
    cout<<"Search is Successful and Position of element is "<<pos+1;
    else
    cout<<"Search Unsuccessful";
    return 0;
}
