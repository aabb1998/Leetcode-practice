class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> mapList = new HashMap<>();
        int[] results = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            if (!mapList.containsKey(target - nums[i])) {
                mapList.put(nums[i], i);
            } else {
                return new int[] {mapList.get(target-nums[i]), i};
            }
        }
        
        throw new IllegalArgumentException();
        
        
    }
}

