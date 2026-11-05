class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int l1=arr1.length;
        int l2=arr2.length;
        int count=0;
        for(int i=0;i<l1;i++)
        {
            int temp=0;
            for(int j=0;j<l2;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d) temp++;
            }
            if(temp==0) count++;
            
        }
        return count;
    }
}
