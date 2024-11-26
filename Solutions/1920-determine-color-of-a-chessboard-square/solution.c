bool squareIsWhite(char* coordinates) {
    int row=coordinates[0]-'a'+1;
    int col=coordinates[1]-'1'+1;
    return (row+col)%2!=0;
    
}
