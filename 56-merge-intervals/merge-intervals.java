class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]>res=new ArrayList();
      
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        for(int[] i:intervals){
            if(res.isEmpty()|| i[0]>res.get(res.size()-1)[1]){
                res.add(i);
            }
            else{
                res.get(res.size()-1)[1]=Math.max(i[1],res.get(res.size()-1)[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}