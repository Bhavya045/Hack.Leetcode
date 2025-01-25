class Solution {
    public int characterReplacement(String s, int k) {
        int []freq = new int[26];
        int ptr=0;
        int maxwindow=0;
        int windowlength=0;
        int maxfreq=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxfreq=Math.max(maxfreq, freq[s.charAt(i)-'A']);
            windowlength=i-ptr+1;
            if(windowlength-maxfreq>k){
                freq[s.charAt(ptr)-'A']--;
                ptr++;
            }
            windowlength=i-ptr+1;
            maxwindow=Math.max(maxwindow,windowlength);
        }
        return maxwindow;
    }
}