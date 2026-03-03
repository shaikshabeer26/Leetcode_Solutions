/*double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
   int m=nums1Size+nums2Size;
    int returnArray[m]; int k=0;
      for(int i=0;i<nums1Size;i++)
      {
          if(nums2[0]>=nums1[i])
          {
              returnArray[k]=nums1[i];
              k++;
          }
          else
          {
              for(int j=0;j<nums2Size;j++)
              {
                  returnArray[k]=nums2[j];
                  k++;
              }
          }
      }
    int x=sizeof(returnArray);
    int y=x/2;
    if(y%2==0)
    {
      double s=(returnArray[y]+returnArray[y-1])/2;
        return s;
    }
    else
        return returnArray[y];
}
    */
double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int m = nums1Size + nums2Size;
    int* merged = malloc(m * sizeof(int));
    int i = 0, j = 0, k = 0;

    // Merge
    while (i < nums1Size && j < nums2Size) {
        if (nums1[i] <= nums2[j]) {
            merged[k++] = nums1[i++];
        } else {
            merged[k++] = nums2[j++];
        }
    }

    // Copy remaining
    while (i < nums1Size) merged[k++] = nums1[i++];
    while (j < nums2Size) merged[k++] = nums2[j++];

    // Find median
    double median;
    if (m % 2 == 1) {
        median = merged[m/2];
    } else {
        median = (merged[m/2 - 1] + merged[m/2]) / 2.0;
    }

    free(merged);
    return median;
}
