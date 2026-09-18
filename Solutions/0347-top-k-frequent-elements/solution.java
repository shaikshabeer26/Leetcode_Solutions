import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    if(nums.length==1) return nums;
    else{
    HashMap<Integer,Integer> h=new HashMap();
    for (int num : nums) {
    h.put(num, h.getOrDefault(num, 0) + 1);
    }
    List<Integer> elements = new ArrayList<>(h.keySet());
    elements.sort((a, b) -> h.get(b) - h.get(a));
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
            result[i] = elements.get(i);
        }
        return result;
        }
    }
}
