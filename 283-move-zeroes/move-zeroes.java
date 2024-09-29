import java.util.Vector;

class Solution {
    public void moveZeroes(int[] nums) {
 Vector<Integer> res = new Vector<>();
     int n=nums.length;

     for(int i=0;i<n;i++){
        if(nums[i]!=0){
            res.add(nums[i]);
        }
     }   
   
     int mark_size=n-res.size();
     for(int i=0;i<=mark_size;i++){
        res.add(0);
     }
     for(int i=0;i<n;i++){
        nums[i]=res.get(i);
     }
    }
}