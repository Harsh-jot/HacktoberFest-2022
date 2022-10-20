// Problem Link: https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {
        if(n < 0) 
          return 1 / power(x, n);
        else 
          return power(x, n);
    }
    public double power(double x, int n){
        if(n == 0) 
          return 1.0;
        if(n == 1) 
          return x;
        double ans = power(x, n / 2);
        if(n % 2 == 0) 
          return ans * ans;
        else 
          return x * ans * ans;
    }
}
