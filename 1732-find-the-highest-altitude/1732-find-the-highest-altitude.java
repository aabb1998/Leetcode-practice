class Solution {
    public int largestAltitude(int[] gain) {
        
        int current = 0;
        int max = current + gain[0];
        
        for (int i = 0; i < gain.length; i++) {
            current = current + gain[i];
            if (current > max) max = current;
        }
        
        return max > 0 ? max : 0;
        
    }
}