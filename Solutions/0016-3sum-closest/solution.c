int abs(int x)
{
    return (x>0)?x:(-1*x);
}
int comp(const void* a, const void* b) {
  	
  	// If a is smaller, positive value will be returned
    return (*(int*)a - *(int*)b);
}
int threeSumClosest(int* nums, int numsSize, int target) {
        
        int n = numsSize;
        
        qsort(nums, n, sizeof(int), comp);

        int closestSum = nums[0] + nums[1] + nums[2]; // initial assumption
        if(n==3)
        {
            return closestSum;
        }
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // If exact match, return immediately
                if (currentSum == target) {
                    return target;
                }

                // Update closest sum if this one is closer
                if (abs(currentSum - target) < abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                // Move pointers based on comparison
                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
}
