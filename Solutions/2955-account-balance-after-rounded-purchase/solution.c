int accountBalanceAfterPurchase(int purchaseAmount) {
    int initialamount=100;
    int rem=purchaseAmount%10;
    int div=purchaseAmount/10;
    if(rem<5)
     return initialamount-(div*10);
    else
     return initialamount-((div*10)+10);
    
}
