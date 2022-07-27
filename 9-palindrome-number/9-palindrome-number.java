class Solution {
    public boolean isPalindrome(int x) {
        
       if (x < 0) return false;
        
        int reversed = 0;
        int remainder = 0;
        int num = x;
        
        while (num != 0) {
            remainder = num % 10;
            reversed = (reversed * 10) + remainder;
            num /= 10;
        }
        
        return reversed == x;
        
    }
}


// 121
// -121
// 10

