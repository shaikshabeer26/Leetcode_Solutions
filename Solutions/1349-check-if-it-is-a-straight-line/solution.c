bool checkStraightLine(int** coordinates, int coordinatesSize, int* coordinatesColSize) {
    if(coordinatesSize<3)return true;
    int x1=coordinates[0][0],y1=coordinates[0][1];
    int x2=coordinates[1][0],y2=coordinates[1][1];
    int dy=y2-y1;
    int dx=x2-x1;
    for(int i=2;i<coordinatesSize;i++){
        x2=coordinates[i][0];
        y2=coordinates[i][1];
        if(dy*(x2-x1)!=dx*(y2-y1))
        return false;
    }
    return true;
}
