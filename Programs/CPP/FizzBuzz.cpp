// FizzBuzz Question Prompt:
// % 3 -> fizz
// % 5 -> buzz
// % 15 -> fizzbuzz

// We are not using '%' directly because: Problem with '%' is a costly operator.
// The complexity of '%' operator is O(n ^ 2)

// Solution without '%' operator

#include<bits/stdc++.h>
using namespace std;
#define eff ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

int main(){
    eff;
    int n;
    cin>>n;
    int c3 = 0;
    int c5 = 0;
    for(int i = 1; i <= n; i++)
    {
        c3++;
        c5++;
        string d = "";
         if(c3 == 3) 
         {
             d += "fizz"; 
             c3 = 0;
         }
         if(c5 == 5)
         {
             d += "buzz";
             c5 = 0;
         }   
         if(d == "") cout << i << "\n";
         else cout << d << "\n";
    }
    return 0;
}
