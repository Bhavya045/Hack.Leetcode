class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int x=g.length;
        int y=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<x &&j<y){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}