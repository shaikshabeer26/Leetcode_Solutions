class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time;
        time=arrivalTime+delayedTime;
      // return time%24;
       if(time==24) return 0;
        else return time%24;
    }
}
