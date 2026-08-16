class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
    int temp=0;
    int min=Integer.MAX_VALUE;
    int j=-1;
     for(int i=0;i<drones.length;i++)
    {
        temp=(Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]));
        if(temp<=drones[i][2])
        {
         if(min>temp)
         {
          min=temp;   
          j=i;
         }
        }   
    }
        return j;
}   
}
