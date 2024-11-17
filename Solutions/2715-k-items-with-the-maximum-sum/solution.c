int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
 if (k<=numOnes) return k*1;
 else if (k<=numOnes+numZeros) return numOnes;
   int x=k-(numOnes+numZeros);
   return numOnes+(x*-1);
}
