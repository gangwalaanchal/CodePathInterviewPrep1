public class Solution {
    public int numRange(int[] A, int B, int C) {
        long[] sum= new long[A.length+1];
        int count=0;
        for(int i=0; i<A.length; ++i){
            sum[i+1]= sum[i]+A[i];
        }
        for(int i=0; i<A.length; i++){
            for(int j= i+1; j<=A.length; j++){
                 if(sum[j]-sum[i]>= B && sum[j]- sum[i]<=C)
                    count++;
            }
        }
        return count;
    }
}

