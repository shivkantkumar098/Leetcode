class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
     int org=x;
     int no=0;
     while(x!=0){
        int rem=x%10;
        no=no*10+rem;
        x/=10;
     }  
     if(no==org){
        return true;
     } 
     else{
        return false;
     }
    }
}