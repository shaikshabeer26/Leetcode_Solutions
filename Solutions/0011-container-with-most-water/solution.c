/**int maxArea(int* height, int heightSize) {
    
}
int maxArea(int height[],int n)
{
    int area;
    for(int i=1;i<n;i++)
    {
       for(int j=n;j>i;j--)
       {
           int R=j,L=i;
           int x=R-L,y;
           if (height[R-1]>=height[L-1])
                  y=(height[L-1]) ;
               else
                  y=(height[R-1]);
           int max=x*y;
           if(max>area)
               area=max;
       }
    }
    return area;
}**/
int maxArea(int height[], int n)
{
    int left = 0, right = n - 1;
    int maxArea = 0;

    while(left < right)
    {
        int h = (height[left] < height[right]) ? height[left] : height[right];
        int area = h * (right - left);

        if(area > maxArea)
            maxArea = area;

        if(height[left] < height[right])
            left++;
        else
            right--;
    }
    return maxArea;
}
