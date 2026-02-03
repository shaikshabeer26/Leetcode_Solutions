class Solution {/*
    public List<List<Integer>> generate(int numRows) {
        
      for(int i=0;i<numRows;i++)
          {
              
          }
        
    }
}*/
public List<List<Integer>> generate(int num) {
        int jagged[][] = new int[num][];
        for(int i=0;i<num;i++){
            int row[] = new int[i+1];
            row[0]=1;
            for(int j=1;j<i;j++) row[j]=jagged[i-1][j-1]+jagged[i-1][j];
            row[i]=1;
            jagged[i]=row;
        }return (List)Arrays.asList(jagged);
}
}
