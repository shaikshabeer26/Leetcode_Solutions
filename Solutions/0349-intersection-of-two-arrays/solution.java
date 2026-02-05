/*class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int l1=nums1.length;
        int l2=nums2.length;
        for(i=0;i<l1-1;i++)
            {
                for(j=0;j<l2-1;j++)
                    {
                        if(nums1[i]==nums2[j]&&nums1[i+1]==nums2[j+1])
  {
      int s=nums1[i];
      int t=nums1[i+1];
      System.out.print(s);
      System.out.print(",",+t);
      break;        
   }
                    }
            }
        return ;
    }
}*/
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : nums1) set1.add(i);

        HashSet<Integer> intersect = new HashSet<>();
        for (int i : nums2) {
            if (set1.contains(i)) {
                intersect.add(i);
            }
        }

        // Convert HashSet to int array
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index++] = num;
        }
        return result;
    }
}

