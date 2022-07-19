class Solution {
    public int[] runningSum(int[] nums) {
        
        int currCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currCount = nums[i] + currCount;
            nums[i] = currCount;
        }
        
        return nums;
    }
}

