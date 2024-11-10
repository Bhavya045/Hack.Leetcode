class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int [][] ans=new int[m][n];
        int size=0;
            int a=original.length;
         if(a!=m*n)
        return new int[0][0];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=original[size++];
            }
        } 
     if(a!=size)
        return new int[0][0];
    return ans;
    }
}