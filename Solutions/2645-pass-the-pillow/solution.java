class Solution {
    public int passThePillow(int n, int time) {
      int temp=time%(n-1),t2=time/(n-1);
      if(time<n) return time+1;
      else if(t2%2==0) return temp+1;
      else return n-temp; 
    }
}
