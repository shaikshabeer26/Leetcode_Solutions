// class Solution {
//     public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
//         long totalcost=0;
//         // if(cost1<costBoth) totalcost+=cost1*need1;
//         // if(cost2<costBoth) totalcost+=cost2*need2;
//         // if(costBoth<=cost1){
//         //     totalcost=costBoth*need1;
//         //     if(costBoth<cost2) need2-=need1;
//         // }
//         // else if(costBoth<=cost2){ if(need2>0) totalcost+=costBoth*need2; }
//         // else{}
//         // return totalcost;
//         long lc1= need1*cost1+need2*cost2;
//         long lc2= Math.max(need1,need2)*costBoth;
//         if(cost1<costBoth) totalcost+=cost1*need1;
//         if(cost2<costBoth) totalcost+=cost2*need2;
//         if(costBoth<=cost1){
//             totalcost=costBoth*need1;
//             if(costBoth<cost2) need2-=need1;
//         }
//         else if(costBoth<=cost2){ if(need2>0) totalcost+=costBoth*need2; }
//         else{}
//         //long finalc=min(totalcost,lc1,lc2)
//         if(totalcost<lc1&&totalcost<lc2) return totalcost;
//         else if(lc2<totalcost&& lc2<lc1) return lc2;
//         else return lc1;


//     }
// }
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = 0;
        if(costBoth >= cost1 + cost2) {
            return (((long)cost1*need1) + ((long)cost2*need2));
        }else{
            int min = Math.min(need1, need2);

            ans += (min*(long)costBoth);

            need1-=min; need2-=min;
            if(need1 > 0){
                if(cost1 > costBoth) ans += ((long)costBoth*need1);
                else ans += ((long)cost1*need1); 
            }else if(need2 > 0){
                if(cost2 > costBoth) ans += ((long)costBoth*need2);
                else ans += ((long)cost2*need2); 
            }
        }

        return ans;
    }
}
