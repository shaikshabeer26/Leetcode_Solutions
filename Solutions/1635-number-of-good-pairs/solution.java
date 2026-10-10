class Solution {
    public int numIdenticalPairs(int[] nums) {
       int n=nums.length;
       int count=0;
    //    for(int i=0;i<n;i++)
    //    {
    //     for(int j=i+1;j<n;j++)
    //     {
    //         if(nums[i]==nums[j]) count++;
    //     }
    //    } 
    //    return count;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        if(map.containsKey(nums[i])) count=count+map.get(nums[i]);
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    return count;
    }
}
