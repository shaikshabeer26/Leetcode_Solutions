/**class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxCount = 0;
        
        for (int i = 0; i < n; i++) {
            int currentCount = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 1) {
                    currentCount++;
                    maxCount = Math.max(maxCount, currentCount);
                } else {
                    break;
                }
            }
        }
        
        return maxCount;
    }
}**/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0, right = 0;
        int ans = 0;
        
        while (right < nums.length) {
            if (nums[right] == 0) {
                // Sequence of 1s broken, calculate length
                ans = Math.max(ans, right - left);
                
                // Skip all consecutive 0s
                while (right < nums.length && nums[right] == 0) {
                    right++;
                }
                // Start next streak from current right
                left = right;
            } else {
                right++;
            }
        }
        // Catch the last sequence if the array ends with 1s
        return Math.max(ans, right - left);
    }
}

