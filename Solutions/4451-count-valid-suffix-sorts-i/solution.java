import java.util.*;
class Solution {
    public int countSuffix(int[] nums, int[] target) {
        int len=nums.length;
        // int count=0;
        // for(int i=0;i<len;i++){
        //  int temp[]=nums.clone(); 
        //  Arrays.sort(temp,i,len);
        //  int left=i,right=len-1;
        //  while(left<right){
        //      int x=temp[left];
        //      temp[left]=temp[right];
        //      temp[right]=x;
        //      left++;
        //      right--;
        //  }
        //  //Arrays.reverse(temp,i,len);
        //  if(Arrays.equals(temp,target)) count++;
        // }
        // return count;
        int []temp1=nums.clone();
        int []temp2=target.clone();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if(!Arrays.equals(temp1,temp2)) return 0;
        int fm=len;
        for(int i=0;i<len;i++)
        {
            if(nums[i]!=target[i]){
                fm=i;
                break;
            }
        }
        int mv=len-1;
        while(mv>0&&target[mv-1]>=target[mv]) mv--;
        int ub=Math.min(len-1,fm);
        if(mv<=ub){ return ub-mv+1;}
        return 0;
    }
}
