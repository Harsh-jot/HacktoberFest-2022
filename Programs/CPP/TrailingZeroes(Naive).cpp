// Program to count the number of Trailing Zeroes in factorial of a number.
// Trailing Zeroes are the number of 0 in the decimal representation of the number after which no other digits follow.

#include<bits/stdc++.h>
using namespace std;

int countTrailingZeroes(int n){
    int fact=1;
    for(int i=2;i<=n;i++)
      fact=fact*i;

    int res=0;
    while(fact%10==0){
        res++;
        fact/=10;
    }  
    return res;

}

int main() {
   // factorial(10)= 362800
   cout<<countTrailingZeroes(10); // output: 2
   return 0;
}

// Time Complexity of this solution is O(n)
