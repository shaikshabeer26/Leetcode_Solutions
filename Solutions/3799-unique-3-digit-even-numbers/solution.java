// class Solution {
//     public int totalNumbers(int[] digits) {
//      int len=digits.length;
//      int temp,x;
     
//      int count=0;
//      for(int i=0;i<len;i++)
//      {
//      temp=digits[i]*10;
//      for(int j=0;j<len;j++)
//      {
//         temp+=digits[j];
//         temp*=10;
//      for(int k=0;k<len;k++)
//      {  
//       x=temp;
//       if(k!=j&&k!=i)
//       {  
//        x+=digits[k];
//        if(x%2==0) 
//        {
        
//         count++;
//       }
//      }
//      }
//      }
//     return count;
//     }
// }
class Solution {
    public int totalNumbers(int[] digits) {
        int[] f = new int[10];
        int res = 0;

        for (int d : digits) f[d]++;

        for (int i = 1; i < 10; i++) 
            for (int j = 0; j < 10; j++) 
                for (int k = 0; k < 9; k += 2) {
                    f[i]--; f[j]--; f[k]--;

                    if (f[i] >= 0 && f[j] >= 0 && f[k] >= 0) res++;

                    f[i]++; f[j]++; f[k]++;
                }           
        

        return res;
    }
}
