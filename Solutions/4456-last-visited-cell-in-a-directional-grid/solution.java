class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        // int []res=new int[2];
        // HashMap<Integer,Integer> Hp=new HashMap<>();
        // do{
        //     if(grid[i][j]="R"){
        //         if(!Hp.contains(i,j+1)){
        //             Hp.add(i,j);
        //             j++;
        //         }
        //     }
        // }
        boolean[][] visited=new boolean[m][n];
        int r=0,c=0;
        visited[r][c]=true;
        while(true){
            char dir=grid[r][c];
            int i=r;
            int j=c;
            if(dir=='R') j++;
            else if(dir=='L') j--;
            else if(dir=='U') i--;
            else i++;
            if(i<0||i>=m||j<0||j>=n||visited[i][j]) break;
            r=i;
            c=j;
            visited[r][c]=true;
        }
         return new int[]{r,c};
        
        
    }
}
