 class Solution {
   public int countBinarySubstrings(String s) {

    int prev = 0;      // Length of previous group
    int curr = 1;      // Length of current group
    int count = 0;     // Result

    for (int i = 1; i < s.length(); i++) {

        // If same character, increase current count
        if (s.charAt(i - 1) == s.charAt(i)) {
            curr++;
        } 
        // If group changes
        else {
            count += Math.min(prev, curr);
            prev = curr;
            curr = 1;
        }
    }

    // Add last comparison
    count += Math.min(prev, curr);

    return count;
   }
 }
