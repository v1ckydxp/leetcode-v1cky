bool isPalindrome(int x){
    if(x < 0)
        return false;
    long reverseX = 0;
    int tmp = x;
    while(tmp){
        reverseX = reverseX*10 + tmp % 10;
        tmp = tmp / 10;
    }
    if(x == reverseX){
        return true;
    }
        
    return false;
}
