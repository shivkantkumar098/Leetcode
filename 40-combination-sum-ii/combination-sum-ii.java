class Solution {
    List<List<Integer>>ans=new ArrayList<>();
     void helper(int[]candidates,int target,int indx,int curSum,List<Integer>temp){
        int n=candidates.length;
        if(curSum>target)return;
        if(indx==n){
            if(curSum==target){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        // inclusion
        temp.add(candidates[indx]);
        helper(candidates,target,indx+1,curSum+candidates[indx],temp);
        temp.remove(temp.size()-1);
        // skip duplicate
        int next=indx+1;
        while(next<n && candidates[next]==candidates[indx]){
            next++;
        }
        // exclusion
        helper(candidates,target,next,curSum,temp);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates,target,0,0,new ArrayList<>());
        return ans;
    }
}