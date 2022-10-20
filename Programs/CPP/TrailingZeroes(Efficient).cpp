// Program to count the number of Trailing Zeroes in factorial of a number.

//  Trailing Zeroes are the number of 0 in the decimal representation of the number after which no other digits follow.

#include<bits/stdc++.h>
using namespace std;

/* Explanation:

Trailing Zero count= [n/5] + [n/25] + [n/125] + ...
 if n < 25 then [n/5]
 if n < 125 then [n/5] + [n/25]
 if n > 125 then [n/5] + [n/25] + [n/125]
 ...
 */

int countTrailingZeros(int n)
{
	int res = 0;

	for(int i=5; i<=n; i=i*5)
	{
		res = res + (n / i);
	}

	return res;
}
int main() {
        // factorial(10)= 362800
    	cout<<countTrailingZeros(10); // output: 2
    	return 0;
}

// Time Complexity of this solution is O(log(n))
