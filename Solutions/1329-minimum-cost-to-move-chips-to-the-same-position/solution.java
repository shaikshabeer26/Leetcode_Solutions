class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int temp: position )
        {
         if(temp%2==0) even++;
         else odd++;     
        }
        return (even<odd)?even:odd;
    }
}
