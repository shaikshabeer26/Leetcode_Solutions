int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
 int sum=arrivalTime+delayedTime;
 return sum%24;   
}
