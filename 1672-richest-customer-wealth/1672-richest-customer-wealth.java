class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max_value = Integer.MIN_VALUE;
        int rows = accounts.length;
        int cols = accounts[0].length;
        
        for (int i = 0; i < accounts.length; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                count += accounts[i][j];
            }
            if (count > max_value) max_value = count;
        }
        
        return max_value;
        
    }
}