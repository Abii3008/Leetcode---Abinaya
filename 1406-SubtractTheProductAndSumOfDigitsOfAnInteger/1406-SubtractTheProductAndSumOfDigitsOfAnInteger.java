// Last updated: 11/08/2026, 16:05:33
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;  
            product *= digit;     
            sum += digit;         
            n /= 10;              
        }
        return product - sum;
    }
} 