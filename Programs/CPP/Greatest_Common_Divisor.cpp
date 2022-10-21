// Greatest Common Divisior of two numbers
// Smallest number that divides both the numbers.

#include<bits/stdc++.h>
using namespace std;


// Euclidean Algorithm
// if b<a then gcd(a,b)=gcd(a-b,b)

int gcd(int a,int b)
{
    while(a!=b)                 
    {                       
            if(a>b)              
              a=a-b;
            else
              b=b-a;  
    }
    return a;
}
//Explanation: 
    // a=12 , b=15
    // b>a  then b=15-12=3, a=12
    // a>b  then a=12-3=9, b=3
    // a>b  then a=9-3=6, b=3
    // a>b  then a=6-3=3, b=3
    // a==b then exit from while loop
    // return a = 3
int main()
{
    int a,b;
    cin>>a>>b;
    cout<<gcd(a,b);
    return 0;
}
           
