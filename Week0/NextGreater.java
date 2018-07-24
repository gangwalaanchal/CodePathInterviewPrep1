public class Solution {
    public int[] nextGreater(int[] A) {
        int[] output= new int[A.length];
        for(int i=0; i<A.length; i++){
            if(i==A.length-1)
                output[i]=-1;
            for(int j= i+1; j<A.length; j++){
                if(j==A.length-1)
                    output[i]=-1;
                if(A[j]>A[i]){
                    output[i]= A[j];
                    break;
                }
            }
        }
        return output;
    }
}

