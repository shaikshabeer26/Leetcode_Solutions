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
  while(i<n&&k>0){                  //way two with same approach
    if(nums[i]==x){
        x++; 
        i++;
    }
    else{ ans=x;
     x++;
     k--;}
  }
  return k==0? ans:nums[n-1]+k;
 
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
