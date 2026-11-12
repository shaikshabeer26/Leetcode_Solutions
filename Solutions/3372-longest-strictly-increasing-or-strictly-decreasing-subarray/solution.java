class Solution {
   public int longestMonotonicSubarray(int[] nums) {
     int inc=1,dec=1,res=1;
      int n=nums.length;
//         List<Integer> l1=new ArrayList<>();
        
//         for(int i=0;i<n-1;i++)
//         {
//          if(i<i+1) dec++;
//          else {
//            l1.add(dec);
//            dec=1;
//           }
//         }
//         for(int i=0;i<n-1;i++)
//         {
//           if(i>i+1) inc++;
//           else 
//           {
//             l1.add(inc);
//             inc=0;
//           }
//         }
//         //int res=parseint(min(l1));
//         int temp=l1;
//        for(int x: l1){
//         if(x>temp) temp=x;
//        }
//        return temp;
    for(int i=1;i<n;i++)
    {
        if(nums[i]<nums[i-1])
        {
            dec++;
            inc=1;
        }
        else if(nums[i]>nums[i-1])
        {
            inc++;
            dec=1;
        }
        else {
            inc=1;
           dec=1;
        }
            res=Math.max(res,Math.max(inc,dec));
    }
    return res;
     }
}
