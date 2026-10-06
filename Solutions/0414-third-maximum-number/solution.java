import java.util.*;
import java.lang.*;
class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n==2) return nums[n-1];
        int count=0,res=0;
        for(int j=n-2;j>=0;j--){
            if(nums[j]<nums[j+1]){
                count++;
                if(count==2){  res=nums[j];//System.out.println("third largest: " + nums[j]);
               // break;}
                }
            }
        }
           // if(count==1) nums[n-1];
        //if(res==0) return nums[n-1];
        if(count<2) return nums[n-1];

        else return res;
    }
}
