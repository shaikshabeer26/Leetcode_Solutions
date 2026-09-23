class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time;
        time=arrivalTime+delayedTime;
      // return time%24;
       /*if(time==24) return 0;  //solution-2
        else return time%24;*/
       if(time<24) return time;
       else return time-24; //only works for the delayedTime is<=24
        
    }
}
