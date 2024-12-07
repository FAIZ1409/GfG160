bool isPalindrome(int x) {
    
    long rev=0;
    long original=x;
    int d;
    while(x>0){
        d=x%10;
        rev=rev*10+d;
        x/=10;
    }
    return original==rev;
}
