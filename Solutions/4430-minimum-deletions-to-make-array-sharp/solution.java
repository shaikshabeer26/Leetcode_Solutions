import java.util.*;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int minDeletions(int[] nums) {
        int n=nums.length;
      //  Set<Integer> set=new HashSet<>();
       // for(int i=0;i<n;i++) set.add(nums[i]); 
       // int[] a=set.toArray(int[] :: new);
        //int n2=a.length;
       // return n-set.size();
    int count=0;
    for(int i=0;i<n-1;i++)
    {
     if((nums[i] ^ nums[i+1])==0){
         count++;
     }
    } 
     return count;
    }
}
