class Solution {
    public static int largestRectangleArea(int[]heights){
        int n=heights.length;
        int[]left=new int[n];
        int[]right=new int[n];
        Stack<Integer>st=new Stack<>();
        // NSL
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        // NSR
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=n;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        // max Area
        int maxArea=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int area=width*heights[i];
            maxArea=Math.max(area,maxArea);

        }
        return maxArea;

    }
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int maxArea = 0;
        int[] heights = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    heights[j]++;
                }
                else{
                    heights[j]=0;
                }
            }
            maxArea=Math.max(maxArea,largestRectangleArea(heights));
        }
        return maxArea;

    }
}