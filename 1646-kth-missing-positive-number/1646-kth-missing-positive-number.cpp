class Solution {
public:
   
  int findKthPositive(vector<int>& A, int k) {
      int start=0;
      int last=A.size()-1;
      while(start<=last){
          int middle=(start+last)/2;
          if(A[middle]-(1+middle)<k)
          start= middle+1;
          else
          last=middle-1;
      }
      return start+k;
  }
      };