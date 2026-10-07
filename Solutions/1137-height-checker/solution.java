class Solution {
    public int heightChecker(int[] heights) {
    int n=heights.length;
/*-----------Approach number-1  ------------------------*/
  /*  int expected[]=new int[n];
    for(int i=0;i<n;i++) expected[i]=heights[i];
    Arrays.sort(expected);
    int count=0;
    for(int i=0;i<n;i++) if(expected[i]!=heights[i]) count++;
    return count; */
/*-----------Approach number 2---------------*/ //for copying existing array to new array we use inbuilt method "new_arrayname=oldarrayname.clone();"
int exp[]=new int[n];
exp=heights.clone();
Arrays.sort(exp);
int count=0;
for(int i=0;i<n;i++) if(exp[i]!=heights[i]) count++;
    return count;


    }
}
