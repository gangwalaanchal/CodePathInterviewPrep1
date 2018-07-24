public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        if(B<=0)
            return -1;
        int count=0;
        int min= Integer.MAX_VALUE;
        int res= Integer.MAX_VALUE;
        if(A.length==1)
            return A[0];
        for(int i=0; i<=A.length-1; i++){
            for(int j= 0; j<=A.length-1; j++){
                if(i==j)
                    continue;
                if(A[j]<=A[i]){
                    count++;
                }
                if(A[j]<min)
                    min= A[j];
            }
            if(B==1)
                return min;
            if(count==B){
                if(A[i]<res)
                    res= A[i];
            }
            if(res<=Integer.MAX_VALUE)
                count=0;
            else
                count=1;
                
            
        }
        return res;
    }
}

