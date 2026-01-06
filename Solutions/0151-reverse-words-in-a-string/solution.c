
void strrev(char* str)
{
    if (!str)  return;
    
    int i = 0;
    int j = strlen(str) - 1;

    while (i < j) {
        str[i] ^= str[j] ^= str[i] ^= str[j];
        i++;
        j--;
    }
}


char* reverseWords(char* s) 
{ 
    char* tok;
    char* res = (char *)calloc(strlen(s)+2, sizeof(char));
    strrev(s);
 
    tok = strtok(s, " ");
    while (tok != 0) {
        strrev(tok);
        strcat(res, tok);
        strcat(res, " ");
        tok = strtok(0, " ");
    }

    res[strlen(res)-1] = '\0';
    return res;
}
