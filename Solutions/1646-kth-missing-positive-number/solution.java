class Solution {
    public int findKthPositive(int[] nums, int k) {
  
    int n=nums.length; /*int idx=0,i=1;
    int count=0;
    while(count<k&&idx<n)           // 1st way 
    {
     if(nums[idx]==i){idx++;
     i++;
     }
     else{ count++;if(k==count) return i;
     else i++;
    }
    }
    return nums[n-1]+(k-count);
    */

  int x=1,ans=0,i=0;
  while(i<n&&k>0){
    if(nums[i]==x){
        x++; 
        i++;
    }
    else{ ans=x;
     x++;
     k--;}
  }
  return k==0? ans:nums[n-1]+k;
//     for(int i=1;i<Math.max(n,k);i++)
//     {
//         if(nums[i]!=i) temp[j++]=i;
//         else i--;
//         if(k==j) return temp[j];
//     }
//  return 0;

 
 /* //efficient approach
 for(int i=0;i<nums.length;i++)
 {
    if(nums[i]<=k) k++;
    else break;
 }
 return k;
 */
    }
}
