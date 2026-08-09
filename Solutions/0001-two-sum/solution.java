// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        int len=nums.length; int sum;
//        int[] res=new int[2];
//         for(int i=0;i<len-2;i++)
//         {
//             for(int j=i+1;j<len-1;j++)
//             {
//                 sum=nums[i]+nums[j];
//                 if(target==sum)
//                 {
//                     res[0]=i;
//                     res[1]=j;
//                  break;
//                 }
//             }
//         }
//         System.out.println(res);
//         return res;
//     }

// }
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];
        
        // Correct boundary conditions: i goes up to len-1, j goes up to len
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    
                    // To print an array properly, use Arrays.toString()
                    System.out.println(Arrays.toString(res)); 
                    return res;
                }
            }
        }
        return res;
    }
}

