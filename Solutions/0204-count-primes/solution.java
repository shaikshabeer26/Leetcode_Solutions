// class Solution {
//     public int countPrimes(int n) {
//         if(n<=2) return 0;
//         //else if(n==2) return 1;
//      int count=1;
//      for(int k=3;k<n;k++)
//      {
//      int x=0;
//      int temp=(int)(Math.sqrt(k));
//      for(int i=2;i<=temp;i++)
//         if(k%i==0){ x++;
//         break;
//         }
//      if(x==0) count++;
//      }
//      return count; 
//     }
// }
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        // Create a boolean array "isPrime[0..n-1]" 
        // default value of boolean array is false in Java
        // So we will assume 'false' means it IS a prime, and 'true' means it is NOT a prime.
        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        // Loop up to the square root of n
        for (int i = 2; i * i < n; i++) {
            if (!isNotPrime[i]) {
                // Mark all multiples of i starting from i*i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        // Count how many numbers are still marked as prime (false)
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }

        return count;
    }
}

