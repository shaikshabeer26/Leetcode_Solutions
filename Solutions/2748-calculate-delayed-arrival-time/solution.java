class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time;
        time=arrivalTime+delayedTime;
        return time%24;
    }
}
