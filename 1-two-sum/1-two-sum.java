class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> values = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            
            // 9 - 2 = 7
            int difference = target - nums[i];
            
            if (values.containsKey(difference)) {
                return new int[] {i, values.get(difference)};
            }
            
            values.put(nums[i], i);
            
        }
        
        
        return null;
        
    }
}