public class Solution {
    public int[][] prettyPrint(int A) {
        int[][] res= new int[A*2-1][A*2-1];
        int top= 0;
        int bottom= A*2-2;
        int right= A*2-2;
        int left= 0;
        int count= A;
        int dir=0;
        
        while(left<= right && top<= bottom){
            if(dir==0){
                for(int i= left; i<=right; i++){
                    res[top][i]= count;
                }
                top++;
                dir=1;
            }
            if(dir==1){
                for(int i= top; i<=bottom; i++){
                    res[i][right]= count;
                }
                right--;
                dir=2;
            }
            if(dir==2){
                for(int i= right; i>=left; i--){
                    res[bottom][i]= count;
                }
                bottom--;
                dir=3;
            }
            if(dir==3){
                for(int i= bottom; i>=top; i--){
                    res[i][left]= count;
                }
                left++;
                dir=0;
            }
            count= count-1;
        }
        return res;
    }
}

