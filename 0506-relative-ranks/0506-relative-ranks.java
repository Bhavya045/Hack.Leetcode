class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n= score.length;
       HashMap<Integer,Integer> hm=new HashMap<>();
        String []result = new String[n];
        for(int i=0;i<n;i++){
            hm.put(score[i],i);
        }
        Arrays.sort(score);
        for(int i=0;i<n;i++){
            int rank=n-i;
            if(rank==1){
                result[hm.get(score[i])]="Gold Medal";
            }
            else if(rank==2){
                result[hm.get(score[i])]="Silver Medal";
            }else if(rank==3){
                result[hm.get(score[i])]="Bronze Medal";
            }
                else result[hm.get(score[i])] = String.valueOf(rank);
        }
        return result;

    }
}