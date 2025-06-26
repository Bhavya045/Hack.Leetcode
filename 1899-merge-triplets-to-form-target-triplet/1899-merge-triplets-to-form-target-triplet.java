class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean foundX=false,foundY=false,foundZ=false;
        for(int[]t:triplets){
            if(t[0]>target[0] || t[1]>target[1] || t[2]>target[2]){
                continue;
            }
            if(t[0]==target[0])foundX=true;
            if(t[1]==target[1])foundY=true;
            if(t[2]==target[2])foundZ=true;
        }
        return foundX && foundY && foundZ;
    }
}