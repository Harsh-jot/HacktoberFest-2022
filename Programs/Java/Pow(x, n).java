// Problem Link: https://leetcode.com/problems/powx-n/

class Solution {
    public double myPow(double x, int n) {
        double output = 1d;
        long power = n;
        if(power < 0){
            power = -1 * power;
        }
        while(power > 0){
            if(power % 2 == 1){
                output = output * x;
                power = power - 1;
            } else {
                x = x * x;
                power = power / 2;
            }
        }
        if(n<0){
            output = (double)(1.0) / (double)(output);
        }
        return output;
    }
}
