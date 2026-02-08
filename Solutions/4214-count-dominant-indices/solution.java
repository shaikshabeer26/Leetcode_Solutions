/*class Solution {
    public int dominantIndices(int[] nums) {
        int l=nums.length;
        int d=0,count=0;
        for(int i=0;i<l;i++)
            {
                int avg=0,sum=0;
                int j=i+1; int c=0;
                while(j<l)
                    {
                     sum=sum+nums[j];
                        j++;
                     c=c+1;
                    }
                avg=sum/c;
                if(nums[i]>avg) count++;
            }
        return count;
    }
}*/
class Solution {
    public int dominantIndices(int[] nums) {
        int l = nums.length;
        int count = 0;

        for (int i = 0; i < l; i++) {
            long sum = 0;
            int elementsToRight = l - 1 - i;

            // Calculate sum of all elements to the right
            for (int j = i + 1; j < l; j++) {
                sum += nums[j];
            }

            // If there are elements to the right, check the average condition
            if (elementsToRight > 0) {
                double avg = (double) sum / elementsToRight;
                if (nums[i] > avg) {
                    count++;
                }
            } else {
                // Logic for the last element: usually it's counted or ignored 
                // based on specific rules. Here we follow "greater than average".
                // Since there are no elements, we often skip it.
            }
        }
        return count;
    }
}

