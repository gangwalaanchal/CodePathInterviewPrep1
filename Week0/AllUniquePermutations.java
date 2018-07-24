public class Solution {
    public int[][] permute(int[] A) {
        List<List<Integer>> list= new ArrayList<>();
        permute(A, list, new ArrayList<Integer>(), new boolean[A.length]);
        int[][] array = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
                int[] tempArray= new int[list.get(i).size()];
                for(int j=0; j<list.get(i).size(); j++)
                    tempArray[j] = list.get(i).get(j);
                array[i]= tempArray;
            } 
            return array;
    }
    public void permute(int[] A, List<List<Integer>> list, List<Integer> temp, boolean[] used){
            if(temp.size()==A.length)
                list.add(new ArrayList<>(temp));
            else
                for(int i=0; i<A.length; i++){
                    if(used[i] || i > 0 && A[i] == A[i-1] && !used[i - 1]) 
                            continue;
                    used[i]= true;
                    temp.add(A[i]);
                    permute(A,list, temp, used);
                    used[i]= false;
                    temp.remove(temp.size()-1);
                }
                
        }
}

