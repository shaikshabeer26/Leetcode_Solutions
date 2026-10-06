import java.util.*;
import java.lang.*;
class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);    // we can sort the array using bubble sort techniques also 
         int max=nums[n-1];          //Approach number 2;
        int t=1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]!=max){
                max=nums[i];
                t++;
            }
            if(t==3) break;
        }
        return t==3? max:nums[n-1];
        /*if(n==2) return nums[n-1];   //Approach number 1
        int count=0,res=0;
        for(int j=n-2;j>=0;j--){
            if(nums[j]<nums[j+1]){
                count++;
                if(count==2) res=nums[j];
            }
        }
        if(count<2) return nums[n-1];
        else return res;*/
       
    }
}
