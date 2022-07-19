class Solution {
    public int[] runningSum(int[] nums) {
        
        int currCount = 0;
        int[] store = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            currCount = nums[i] + currCount;
            store[i] = currCount; 
        }
        
        return store;
    }
}


// [1,2,3,4]
//    - 
// set currCount to nums[i] + currCount
// increment i
// repeat