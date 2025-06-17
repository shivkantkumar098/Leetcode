class Solution {
    public boolean isPalindrome(int x) {
        int ori=x;
        // this is for negative TC
        if(x<0)return false;
        int rev=0;
        while(x!=0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(ori!=rev)return false;
        else return true;
    }
}