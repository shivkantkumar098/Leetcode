class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int []maxiL=new int[n];
        int[]maxiR=new int[n];
        int[]water=new int[n];
        if (n == 0) return 0;

        maxiL[0] = height[0];
        for(int i=1;i<n;i++){
            maxiL[i]=Math.max(maxiL[i-1],height[i]);
        }

        maxiR[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxiR[i]=Math.max(maxiR[i+1],height[i]);
        }
        
        int sum=0;
        for(int i=0;i<n;i++){
            water[i]=Math.min(maxiR[i],maxiL[i])-height[i];
            sum+=water[i];
        }
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=water[i];
        //     // sum += Math.max(0, water[i]);

        // }
        return sum;
        
    }
}