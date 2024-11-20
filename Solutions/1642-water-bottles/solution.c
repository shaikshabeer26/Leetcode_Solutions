int numWaterBottles(int numBottles, int numExchange) {
    int count=numBottles;
    while(numBottles>=numExchange){
    int newBottles=numBottles/numExchange;
    int remaining=numBottles%numExchange;
    numBottles=newBottles+remaining;
    count=count+newBottles;}
return count;
}
