int accountBalanceAfterPurchase(int purchaseAmount) {
    int initialbalance=100;
    int rounded=(((purchaseAmount+5)/10)*10);
    return initialbalance-rounded;
    
}
