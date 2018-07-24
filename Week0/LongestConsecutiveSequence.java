public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        
        HashSet<Integer> set= new HashSet<>();
        int max=1;
        for(int i: A)
            set.add(i);
        for(int val: A){
             int left= val-1;
             int right= val+1;
             int count=1;
             
             while(set.contains(left)){
                 count++;
                 set.remove(left);
                 left--;
             }
             while(set.contains(right)){
                 count++;
                 set.remove(right);
                 right++;
             }
             max= Math.max(count, max);
        }
        return max;
    }
}

