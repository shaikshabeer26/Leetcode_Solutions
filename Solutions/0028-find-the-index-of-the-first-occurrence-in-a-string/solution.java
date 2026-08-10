// class Solution {
//     public int strStr(String haystack, String needle) {
//         if(haystack.contains(needle))
//         {
//             char c=needle;
//             for(int i=0;i<length.haystack;i++)
//             {
//                 if(c==haytack[i]) return i;
//             }
//         } 
//         else return -1;

//     }
// }
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
