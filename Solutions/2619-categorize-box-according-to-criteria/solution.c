char* categorizeBox(int length, int width, int height, int mass) {
    long volume=(long)length*width*height;
    bool isBulky=length>=1e4||width>=1e4||height>=1e4||volume>=1e9;
    bool isHeavy=mass>=100;
    if (isBulky&&isHeavy) return "Both";
    else if (isBulky) return "Bulky";
    else if(isHeavy) return "Heavy";
    else
    return "Neither";
}
