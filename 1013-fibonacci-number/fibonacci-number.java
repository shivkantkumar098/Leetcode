class Solution {
    public int fib(int n) {
        // int a=0,b=1;
        // for(int i=2;i<=n;i++){
        //     int next=a+b;
        //     a=b;
        //     b=next;
        // }
        // return b;
        if(n<=1)return n;
        return fib(n-1)+fib(n-2);
        
    }
}