// class Solution {
//     public int sumfunction(List<Integer> nums,int j,int sum,int count,int l)
//     { 
//         if(count==nums.size()-1) return sum;
//         else{
//          for(int i=j;i<l;i++) sum+=nums.get(i);
//         if(sum<=0){ 
//             j++;
//             count++;
//             return sumfunction(nums,j,sum,count,l);
//         }
//         }
//         return 0;
//     }
//     public int minimumSumSubarray(List<Integer> nums, int l, int r) {
//          int len=nums.size();
//          int count=0;
//         //Arrays.sort(nums);
//         int sum=0;
//         Collections.sort(nums);
//         int j=0;
//         //return (sum>0)? sum:-1;
//         sum=sumfunction(nums,j,sum,count,l);
//         return sum;
//     }
    
// }
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        // Start recursion from index 0 with initial minSum set to Integer.MAX_VALUE
        int result = sumfunction(nums, 0, l, r, Integer.MAX_VALUE);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int sumfunction(List<Integer> nums, int start, int l, int r, int minSum) {
        int size = nums.size();

        // Base case: stop when there aren't enough elements left for a subarray of length l
        if (start + l > size) {
            return minSum;
        }

        // Check all valid subarray lengths (from l to r) starting at 'start'
        int currentSum = 0;
        for (int end = start; end < size && (end - start + 1) <= r; end++) {
            currentSum += nums.get(end);
            int length = end - start + 1;

            if (length >= l && currentSum > 0) {
                minSum = Math.min(minSum, currentSum);
            }
        }

        // Move to the next starting index
        return sumfunction(nums, start + 1, l, r, minSum);
    }
}

