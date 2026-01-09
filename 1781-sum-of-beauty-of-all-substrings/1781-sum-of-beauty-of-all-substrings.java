class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer>hm=new HashMap<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                hm.put(ch, hm.getOrDefault(ch,0)+1);
                int maxfreq=0;
                int minfreq=Integer.MAX_VALUE;
                for(int freq:hm.values()){
                    maxfreq=Math.max(freq,maxfreq);
                    minfreq=Math.min(freq,minfreq);
                }
                 ans += (maxfreq-minfreq);
            }
        }
        return ans;
    }
}