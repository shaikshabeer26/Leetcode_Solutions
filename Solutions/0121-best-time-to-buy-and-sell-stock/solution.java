/*class Solution {
public int maxProfit(int[] prices) {
    int profit;
  int  n=prices.length;
    int[] Fprifit=new int[n];
 for(int i=0;i<n-1;i++)
 { 
  int B=prices[i];
  if(B<prices[i+1])   {
   profit=prices[i+1];}
  for(int j=i+2;j<n;j++)
  {
  if(profit<prices[j]){
     Fprofit[i]=prices[j];}
  else Fprofit[i]=profit;
  }
                
 }
  Array=Array.Sort(Fprofit);
   int l=Fprofit.length;
    return Fprofit[n-1];
}
}*/
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update the cheapest day to buy
            if (price < minPrice) {
                minPrice = price;
            } 
            // Check if selling today beats our best profit so far
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}

