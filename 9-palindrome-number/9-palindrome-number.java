class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;
        
        int reversed = 0;
        int num = x;
        int remainder = 0;
        
        while (num != 0) {
            remainder = num % 10;
            reversed = (reversed * 10) + remainder;
            num /= 10;
        }
        
        System.out.println(reversed);
        return reversed == x;
        
    }
}

